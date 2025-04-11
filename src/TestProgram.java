public class TestProgram {
    public static void main(String[] args) throws Exception {
        Student student = new Student();

        Resource book = new Book("The City of Golden Bones");
        Resource journal = new Journal("Journal of Neuroscience");
        Resource theses = new Thesis("The Role of Technology in Modern Education: Enhancing Learning Outcomes in STEM Subjects");
        Resource capstone = new Capstone("Development of a Cybersecurity Framework for Small Businesses");
        Resource internet = new Internet("college.neu.edu.ph");
        Resource newspaper = new Newspaper("The Financial Times");
        
        student.borrowResource(book);
        student.borrowResource(journal);
        student.borrowResource(theses);
        student.borrowResource(capstone);
        student.borrowResource(internet);
        student.borrowResource(newspaper);
    }
}