public class DemoMain {


    public static void main (String args[]) {

        String teststring = "hello World ";

//    public void setTeststring (String teststring) {this.teststring = teststring;}


        System.out.println (" output :" + teststring);

        String str = "Hello World";
        String anotherString = "hello world";
        Object objStr = str;

        /* compare two strings, case sensitive */
        System.out.println("test-1 :" +str.compareTo(anotherString) );
        /* compare two strings, ignores character case  */
        System.out.println("test-2  :" + str.compareToIgnoreCase(anotherString) );
        /* compare string with object */
        System.out.println("Test-3 comapre string to object :  " + str.compareTo((String) objStr) );

        CustomerClass  customerc = new CustomerClass() ;

        customerc.setFirstName ("Reza");

        System.out.print ("First name sent : "+ customerc.getFirstName ());

    }

}
