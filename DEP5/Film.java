public class Film {
    private String name;
    private String director;
    private int copies;

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public int getCopies() {
        return copies;
    }

    public Film(){
        this.name = "NA";
        this.director="NA";
        this.copies=0;
    }
    public Film(String name, String director, int copies){
        this.name=name;
        this.director=director;
        this.copies=copies;
    } public void Set(String name, String director, int copies){
        this.name=name;
        this.director=director;
        this.copies=copies;
    }
    public int insert(){
        this.copies=this.copies+=1;
        return this.copies;
    }
    public int remove(){
        this.copies=this.copies-=1;
        return this.copies;
    }
    public boolean check(){
        boolean check=false;
        if(this.copies>0){
            check=true;
            return check;
        }else{
            return check;
        }
    }
    @Override
    public String toString() {
        return "Film name: " + name + "\n" +
                "director: " + director + "\n" +
                "copies in store:" + copies;
    }
}