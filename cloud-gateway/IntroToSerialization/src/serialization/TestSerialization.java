package serialization;


import java.io.*;

class  A implements Serializable{
    Integer id;
    String name;

    public A(String name , Integer id){
        this.id=id;
        this.name=name;
    }
}

public class TestSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Object for A
        var a =new A("pratyay",21);
        //Creating a file
        FileOutputStream fos=new FileOutputStream("serailizingAclass.txt");
        var objStream=new ObjectOutputStream(fos);
        objStream.writeObject(a);
        //object a serialized

        //deserializing
        var b=new FileInputStream("serailizingAclass.txt");
        var objRead=new ObjectInputStream(b);
       var newA=(A) objRead.readObject();
        System.out.println(newA.id+" name: "+newA.name);
        objStream.close();
        objRead.close();
    }
}
