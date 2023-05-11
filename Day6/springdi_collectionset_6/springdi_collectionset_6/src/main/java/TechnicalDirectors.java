import java.util.Set;
 
public class TechnicalDirectors {
 
    private Set<String> directorSet;
 
    public Set<String> getDirectorSet() {
        return directorSet;
    }
 
    public void setDirectorSet(Set<String> directorSet) {
        this.directorSet = directorSet;
    }
     
    public void printDirectors(){
        System.out.println(this.directorSet);
    }
}