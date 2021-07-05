import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> names= Arrays.asList("q","b","c","d","e","x","y","z");
		
		List<String> upper=names.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		
		int m= IntStream.range(0, 10).reduce(0,(x,y) -> x>y?x:y);
		System.out.print(m);
		
		
	Consumer<String> c1= (s) -> {System.out.print(s.toUpperCase());};
	
	Predicate<Integer> p1 =(s) ->  {return s>0;};
	
	Function<String,String> f1 = (s) -> { return s.toUpperCase();};
	
	System.out.println(f1.apply("javwwwwwa"));
	
	System.out.println(p1.test(2));
	
	c1.accept("Java");
	
	names.forEach(c1);
	
	
	Stream.of("one", "two", "three", "four")
	  .filter(e -> e.length() > 3)
	  .peek(e -> System.out.println("Filtered value: " + e))
	  .map(String::toUpperCase)
	  .peek(e -> System.out.println("Mapped value: " + e))
	  .collect(Collectors.toList());
		
	  //  names.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
		
	//	System.out.print(upper);
	}

}
