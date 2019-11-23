package serializable;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.*;

public class Main { //próba zapisania obiektu do pliku
    public static void main(String[] args) {
//        Employee employee = new Employee("Ewelina", "ul. Gliwicka", 1234);
//        serializeObject(employee);

        Employee saveEmployee = deserializeObject();
        System.out.println(saveEmployee.name + ' ' + saveEmployee.address + ' ' + saveEmployee.pin); //wczytanie pliku zserializowanego wczesniej

    }

    private static void serializeObject(Employee employee) {
        FileOutputStream fileOut = null; //umożliwia zapis obiektów zserializowanych
        ObjectOutputStream out = null;
        try {
            fileOut = new FileOutputStream("C:/Pliki/employee.ser"); //tworzymy i podajemy ścieżkę
            out = new ObjectOutputStream(fileOut);
            out.writeObject((employee)); //zapis obiektu
            out.close(); //należy zamknąc oba streamy, warto przenieśc fo do bloku finaly, żeby pomimo wszystko, jesli wystapi błąd, deskryptory się zamkneły
            fileOut.close();
            System.out.println("Serialized data saved");
        } catch (IOException e) {
            if (fileOut != null)
            e.printStackTrace();
        }
    }
    private static Employee deserializeObject() {
        try {
            FileInputStream fileIn = new FileInputStream("C:/Pliki/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Employee employee = (Employee) in.readObject();
            in.close();
            fileIn.close();
            return employee;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Employee class not found");
            e.printStackTrace();
            return null;
        }
    }
}
