import java.util.HashMap;
import java.util.TreeMap;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Reduce {
    record Employee(String department,String name, Integer salary){}
    public static void main(String[] args) {
        var integerStream = Stream.of(1, 3, 5, 6, 10, 22, 90);

        var employeeStream = Stream.of(
                new Employee("IT", "Nagesh", 100000),
                new Employee("IT", "Neha", 30000),
                new Employee("HR", "Snehal", 23000),
                new Employee("IT", "Dan", 12000),
                new Employee("SALES", "Viraj", 12000),
                new Employee("SALES", "Narsing", 8900)
                );
        var reduce2 = integerStream.reduce(100, Integer::sum);
        System.out.println("reduce = " + reduce2);
        //var reduce1 = employeeStream.reduce((a, b) -> a.salary > b.salary ? a : b);
        //employeeStream.reduce((a, b) -> a.salary + b.salary);
        //System.out.println("reduce1 = " + reduce1);

        BinaryOperator<Integer> combiner = (length1, length2) -> length1 + length2;
        BiFunction<Integer, Employee, Integer> accumulator =
                (partialReduction, element) -> partialReduction + element.salary;

        var reduce = employeeStream.reduce(0, accumulator, combiner);
        System.out.println("reduce = " + reduce);

        employeeStream
                .collect(Collectors.groupingBy(s->s.department));

        employeeStream
                .collect(Collectors.groupingBy(s->s.department, Collectors.summingInt(Employee::salary)));
    }
}
