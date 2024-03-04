package apps;

public class DataBaseAssigment {
   String association = """
          -this is a relationship between tables.
          -Association are expressed through foreign keys that establish connections between tables.""";
    String Composition = """
            - composition is represented by a strong ownership relationship where the "part" table cannot exist without the "whole" table.""";

    String Aggregation = """
            - This is a form of relationship where one table is considered the whole and th other as "part"
            - its often represented by  foreign key relationships where the "part" table has a foreign key referencing the primary key of the "whole"\s""";


    String IntegrityConstrains = """
            Integrity constraints are the protocols a table must follow.these are used to restrict the type of information that can be entered into a table """;
    String EntityIntegrityConstraint = """
            - its used to ensure the primary key is not null
            - This is because the primary key value is used to identify individual rows in relation and if the primary key has a null value, then we can't identify those rows.""";
    String domainIntegrityConstraint  = """
            Domain constraints can be defined as the definition of a valid set of values for an attribute.
            The data type of domain includes string, character, integer, time, date, currency, etc. The value of the attribute must be available in the corresponding domain.
            
            """;
    String referentialIntegrityConstraint = """
            - it ensures there is always a valid relationship between two tables
            - This is because the primary key value is used to identify individual rows in relation and if the primary key has a null value, then we can't identify those rows.""" ;





 public void  anormaly(){
   String insertTionAnormaly = """
           An insertion anormaly occurs when you are unable top add to the database without having some other related data
           - it mostly happen in tables that have relationship with other tables.
           e.g. Suppose you have a table that tracks courses and instructors. If you can't add a new course until you also assign an instructor, this is an insertion anomaly.
                       This situation makes it difficult to insert data without providing information about another entity (instructor).
   """;

   String updateAnormaly = """
           - An update anormaly occurs when you have data redundancy, and updating one instance of data leads to inconsistencies.
           e.g . Consider a table where you store employee details along with their department.if an employee changes departments, updating only the employee's record without updating the corresponding department record can lead to inconsistencies.""";
   String deleteAnormaly = """
           -A delete anormaly happens  when you delete a data unintentionally that leads to the loss of other  related data that you may want to keep
           e.g In a database where student information is stored with the courses they have taken, deleting a student's record might also delete information about courses that no other students have taken, leading to a loss of data.
               """;
 }

}

