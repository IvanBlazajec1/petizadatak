public class Student {
    private String name;
    private String lastName;
    private int godinaStudija;
    private String brojIndeksa;
    public String getName(){
        return name;
    }
    public void setName(String name1){
        this.name=name1;
    }
    public String getLastName(){
        return lastName;
    }
    public void  setLastName(String lastName1){
        this.name=lastName1;
    }
    public int getGodinaStudija(){
        return godinaStudija;
    }
    public void setGodinaStudija(int godinaStudija1){
        this.godinaStudija=godinaStudija1;
    }
    public String getBrojIndeksa(){
        return brojIndeksa;
    }
    public void setBrojIndeksa(String brojIndeksa1){
        this.brojIndeksa=brojIndeksa1;
    }
    public Student(String name, String lastName, int godinaStudija, String brojIndeksa){
        this.name=name;
        this.lastName=lastName;
        this.godinaStudija=godinaStudija;
        this.brojIndeksa=brojIndeksa;

    }
}
