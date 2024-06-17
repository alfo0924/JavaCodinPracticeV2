import java.io.Serializable;

public class Student implements Serializable
{
    private String name;//name
    private short EnglishScore;//englishScore
    private short MathScore;//mathScore
    private short JavaScore;//JavaScore

    public String getN(){return name;}
    public short getE(){return EnglishScore;}
    public short getM(){return MathScore;}
    public short getJ(){return JavaScore;}

    public Student(String s, short e , short m , short j )
    {
        name=s;
        EnglishScore=e;
        MathScore=m;
        JavaScore=j;
    }
    public double getAvg()
    {
        return (EnglishScore+MathScore+JavaScore)/3.0;
    }



}
