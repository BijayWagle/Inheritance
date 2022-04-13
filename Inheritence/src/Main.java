
public class Main {
public static void main(String [] args) {
	Book java=new Book (123456,"Intro to java");
	Book aws=new Book (456123,"Intro to aws","Bj");
	
	PaperBook python=new PaperBook(789456,"Intro to python","harry",100,2.5f);
	PaperBook node=new PaperBook(789456,"Intro to node","harry",100,3.5f);
	
	EBook angular= new EBook(852123,"Intro to angular","Sammy","angular dci.com",11.2f);
	EBook react =new EBook(987564,"Intro to react framework","react.dci.com",25.5f);
	
	System.out.println(java.generateID());
	System.out.println(node.generateID());
	System.out.println(angular.generateID());
}
}
