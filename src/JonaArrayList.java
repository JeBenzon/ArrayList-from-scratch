import java.lang.reflect.Member;
import java.util.Collection;
import java.util.Iterator;



public class JonaArrayList {

    int capasity = 4;
    int size = 0;
    memberPlayer[] myArray = new memberPlayer[capasity];
    memberPlayer[] midlArray;


    // Adder en memberPlayer som den får med ved metodekaldet
    public void add(memberPlayer element) {
        try{
            if(CheckArraySize()) {reSize();}
            myArray[size]=new memberPlayer(element.name,element.lastname, element.age,element.team);
            size++;
            System.out.println("Du tilføjede et medlem: " + element.name);
        }catch (Exception e){ System.out.println("der skete en fejl"); }
    }

    public boolean CheckArraySize() {
        boolean isToBig = false;
        if(size >= capasity){
            isToBig = true;
            System.out.println("Du tjekkede sandt i Arraylist størrelse, så er størrelse større end capasity");
        }
        return isToBig;
    }

    public void reSize(){
        capasity= capasity*2;
        midlArray = new memberPlayer[capasity];
        for(int i = 0; i < size; i++) {
            midlArray[i] = new memberPlayer(myArray[i].name,myArray[i].lastname,myArray[i].age,myArray[i].team);
        }
        myArray = midlArray;
        System.out.println("Du reSizede listen til" + capasity);
    }

    public void createArray(){
        myArray = new memberPlayer[capasity];
    }

    public memberPlayer get(int index) throws MyBufferException {
        return myArray[index];
    }

    public int size() {
        return size;
    }

    public void clear() {

    }

    public boolean contains(Object element) {
        return false;
    }

    public Object remove(Object element) throws MyBufferException {
        return null;
    }

    public boolean isEmpty() {
        return false;
    }

    public Iterator iterator() {
        return null;
    }

    public boolean addAll(Collection collection) {
        return false;
    }
}
