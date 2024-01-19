package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream stream = Stream.of(10,20,79,98,67);
		//long count = stream.count();
		//System.out.println(count);
		
		Comparator <Integer> comparator = (i1, i2) -> { return i1.toString().compareTo(i2.toString());};
		
		Optional <Integer> optional = stream.max(comparator);
		
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		else
			System.out.println(optional.orElse(0));
		
		String  names[] = {"satish","ravindra kumar","ford","adam gilkiris","king khan"};
		
		Stream<String> stream2 = Arrays.stream(names);
		
		stream2.map((str)->{System.out.print(str); return str.length();}).forEach((len)->{System.out.println(len);});
		
		List list = Arrays.asList(names);
		
		Stream<String> stream3 = list.stream();
		
		stream3.map((str)->{return str.length();}).filter((len)->{return len>7;}).forEach(System.out::println);
		

	}

}
