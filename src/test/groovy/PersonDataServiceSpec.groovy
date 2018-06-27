

import grails.testing.gorm.DataTest
import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class PersonDataServiceSpec extends Specification implements ServiceUnitTest<PersonDataService>, DataTest {

    def setupSpec() {
        mockDomain Person
    }

    void 'first test'() {
        expect:
        service.list().size() == 0
    }
}
