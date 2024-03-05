import java.util.ArrayList;

public class Student {

    private String firstName;
    private String lastName;
    private ArrayList<Subject> subjects;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = new ArrayList<>();
    }

    public boolean addSubject(String subjectName) {
        for (Subject subject: subjects) {
            if (subject.getName().equals(subjectName)) return false;
        }
        subjects.add(new Subject(subjectName));
        return true;
    }

    public boolean removeSubject(String subjectName) {
        for (int i = 0; i < subjects.size(); i++) {

            if (subjects.get(i).getName().equals(subjectName)) {
                subjects.remove(i);
                return true;
            }

        }
        return false;
    }

    public boolean updateSubjectGrade(String subject, int grade) {

        for (int i = 0; i < subjects.size(); i++) {

            if (subjects.get(i).getName().equals(subject)) {
                subjects.get(i).setCurrentGrade(grade);
                return true;
            }

        }
        return false;
    }

    /**
     * The method bestSubject will return the subject that the student is strongest in (the subject with the
     * current highest grade). If there are multiple subjects with an equal current high score, the first subject
     * with that score will be returned.
     * @return the name of the subject with the current highest score (a String).
     */
    public String bestSubject() {
        int max=0;
        String cur = "";
        for(Subject subject:subjects){
            if(subject.getCurrentGrade()>max){
                max=subject.getCurrentGrade();
                cur = subject.getName();
            }
        }
        return cur;
    }

    /**
     * The method averageGrade will return the average grade across all subjects that the student is taking (a double).
     * @return the students' average grade (a double).
     */
    public double averageGrade() {
        double avg = 0;
        for(Subject subject:subjects){
            avg += subject.getCurrentGrade();
        }
        avg /= subjects.size();
        return avg;

    }

    /**
     * The method reportCard will return a report card in the form of a String.
     * The report card will be in the following format:
     *
     * Report card for [name]
     * [Subject 1] [tab] [grade]
     * [Subject 2] [tab] [grade]
     * [Subject 3] [tab] [grade]
     * [Subject 4] [tab] [grade]
     * ...
     * @return the student's report card (a String).
     */
    public String reportCard() {

        return null;

    }

}
