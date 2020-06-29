public class demo{
	public static void main(String[] agrs){
        List<String> list= new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator<String>it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
       		 }
	}
}
