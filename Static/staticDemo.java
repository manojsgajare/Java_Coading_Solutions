package Static;

class staticVarAndMethodUse {

    String name;
    int rollNo;
    static String cllgName;
    static int counter = 0;

    public staticVarAndMethodUse(String name) {

        this.name = name;

        this.rollNo = setRollNo();
    }

    static int setRollNo() {
        counter++;
        return counter;
    }

    static void setCllgName(String name) {
        cllgName = name;
    }

    void getStudentInfo() {
        System.out.println("name: " + this.name);
        System.out.println("rollNo: " + this.rollNo);
        System.out.println("cllgName: " + cllgName);
    }
}

public class staticDemo{

    public static void main(String[] args) {
            staticVarAndMethodUse.setCllgName("XYZ");
            staticVarAndMethodUse s1 = new staticVarAndMethodUse("Alice");
            staticVarAndMethodUse s2 = new staticVarAndMethodUse("Bob");
            s1.getStudentInfo();
            s2.getStudentInfo();
        }
}
