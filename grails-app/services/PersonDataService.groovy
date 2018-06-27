import grails.gorm.services.Service

@Service(Person)
abstract class PersonDataService {
    abstract List<Person> list()
}
