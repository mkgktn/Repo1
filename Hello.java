//1) Create a java program
//2) Create Jenkins Job to run the program
//	cmd/ go to Jenkins folder
//	java -jar jenkins.war --httpPort=9191   // for specific port //othewise it 
//						//will start with //default 8080 port
//
public class Hello{
    public static void main(String [] args){
	for (int i=1; i<=10; i++) {
	   System.out.println("Hello World ..." + i);
	}
	
    }

}