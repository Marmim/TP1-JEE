package WS;

public class Student {

        private int id;
        private String fullName;
        private String CIN;
        private String dateNaissance;
        private String filiere;

        // Constructeurs, getters et setters
        public Student(int id, String fullName, String CIN, String dateNaissance, String filiere) {
            this.id = id;
            this.fullName = fullName;
            this.CIN = CIN;
            this.dateNaissance = dateNaissance;
            this.filiere = filiere;
        }

        // Getters et Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNomComplet() {
            return fullName;
        }

        public void setNomComplet(String fullName) {
            this.fullName = fullName;
        }

        public String getCIN() {
            return CIN;
        }

        public void setCIN(String cin) {
            this.CIN = cin;
        }

        public String getDateNaissance() {
            return dateNaissance;
        }

        public void setDateNaissance(String dateNaissance) {
            this.dateNaissance = dateNaissance;
        }

        public String getFiliere() {
            return filiere;
        }

        public void setFiliere(String filiere) {
            this.filiere = filiere;
        }
    }

