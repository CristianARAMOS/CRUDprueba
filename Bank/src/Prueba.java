import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Prueba {
	
	List<Integer> lista1 = new ArrayList<>();
	{
		lista1.add(1);
		lista1.add(2);
		lista1.add(3);
		lista1.add(4);
		lista1.add(5);
	}
	public List<Integer> lista2(){
		return lista1.stream().filter(n->n>3).collect(Collectors.toList());
		
	}

	public static void main(String[] args) {
		System.out.println(new Prueba().lista2());

	}

}
