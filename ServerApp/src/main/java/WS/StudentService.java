package WS;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class StudentService {

        private List<Student> etudiants = new ArrayList<>();

        public StudentService() {
            etudiants.add(new Student(1, "Elomari maryame", "L9876G", "2001-01-01", "Informatique"));
            etudiants.add(new Student(2, "Omar alaoui", "TR345", "1996-11-02", "Mathématiques"));
            etudiants.add(new Student(3, "Mahdi massbah", "P7899", "1990-07-06", "Physique"));
        }

        @WebMethod
        public List<Student> getAllStudents() {
            return etudiants;
        }

        @WebMethod
        public List<Student> getLimitStudents(int limit) {
            return etudiants.subList(0, Math.min(limit, etudiants.size()));
        }

        @WebMethod
        public Student getStudmetsBycin(String cin) {
            for (Student etudiant : etudiants) {
                if (etudiant.getCIN().equals(cin)) {
                    return etudiant;
                }
            }
            return null;
        }
    }

