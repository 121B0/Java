/**
 * @see https://docs.oracle.com/javase/8/docs/api/
 */
public class Twofer {
    public String twofer(String name){
        return String.format("One for %s, one for me.", (name==null? "you":name));
    }
}
