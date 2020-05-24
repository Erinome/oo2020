import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String args[]) throws IOException {

		String fileName = "C://Users//raner//Documents//Kool//Java OOP//w10_tunnirakenduse_lahendus//cars.txt";
		List<String> list = new ArrayList<>();
		FileWriter myWriter = new FileWriter("carsUpperCasedandSorted.txt");

		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			list = stream
					.filter(line -> !line.startsWith("bmw"))
                    .map(String::toUpperCase)
                    .sorted()
					.collect(Collectors.toList());
					//.forEach(myWriter::println);

		} catch (IOException e) {
			e.printStackTrace();
		}

		list.forEach(System.out::println);
		myWriter.close();
	}
	
}