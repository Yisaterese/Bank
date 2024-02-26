package apps;

public class DataBaseAssigment {
   String association = """
          this is a relationship between data bas tables.""";
    String Composition = """
            _ composition is the relationship where a table is contained of another table but both can live independently
            _ it uses a "part of" relationship. \s""";

    String Aggregation = """
            - This is a form of relationship that uses "has a" relationship\s""";

    String EntityIntegrityConstraint = """
            - its used to ensure the primary key is not null""";
    String domainIntegrityConstraint  = """
            - it consist of a set of  certain conditions to restrict type of values a column can hold in a database table""";

    String referentialIntegrityConstraint = """
            - it ensures there is always a valid relationship between two tables""" ;
}
