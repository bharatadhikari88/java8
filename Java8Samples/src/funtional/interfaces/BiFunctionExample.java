package funtional.interfaces;

import java.util.Collections;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class BiFunctionExample {

	public static BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
	public static Function<Integer, Integer> square = (a) -> a * a;

	public static Consumer<Integer> print = (sum) -> System.out.println(sum);

	public static void main(String[] args) {
		System.out.println(add.apply(2, 5));
		

		print.accept(add.andThen(square).apply(2, 3));
	}

}
