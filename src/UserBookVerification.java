public class UserBookVerification {
    public boolean userBookVerefication(int id){
        User user = User.users.get(id);
        if(user.getType().equalsIgnoreCase("Студент")){
            Student student = Student.students.get(id);
            if(student.getNumberBook() <= student.maxBook){
                return true;
            }
            else{
                return false;
            }
        }
        else if(user.getType().equalsIgnoreCase("преподаватель")){
            Teacher teacher = Teacher.teachers.get(id);
            if(teacher.getNumberBook() <= teacher.maxBook){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
}
