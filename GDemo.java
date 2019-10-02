import java.util.Queue;

public class GDemo {

	public static void main(String[] args) {
	
		WeightedGraph<String> graph = new WeightedGraph<>();
		graph.addVertex("Philly");
		graph.addVertex("Chicago");
		graph.addVertex("Denver");
		graph.addVertex("San Francisco");
		
		graph.addEdge("Philly", "Denver", 2000);
		graph.addEdge("Denver", "Philly", 2000);
		graph.addEdge("Denver", "San Francisco", 1300);
		graph.addEdge("Denver", "Chicago", 1000);
		graph.addEdge("San Francisco", "Denver", 1300);
		graph.addEdge("Chicago", "San Francisco", 1700);
		
		//Wher can i fly from denver
		
		Queue<String> denverFlights = graph.getToVertices("Denver");
		System.out.println("Denver flights:" +denverFlights);
		
		//What is the distance from Denver to San Fran
		
		System.out.println("Distance between Denver and Sf" +graph.weightIs("Denver", "San Francisco" ));
		
		
}
	
}
