package collection.list.list_3;

import java.util.List;

public class School {
    private List<StudyClass> classList;

    public School(List<StudyClass> classList){
        this.classList = classList;
    }

    public List<StudyClass> getClassList(){
        return classList;
    }
}
