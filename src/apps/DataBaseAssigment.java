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


}
