import spock.lang.Specification

class _3_MethodInvocationsTest extends Specification {

    _3_MethodInvocations sub = new _3_MethodInvocations()

    def "should successfully call method without parentheses"() {
        when:
        String result = sub.callMeWithoutParentheses "Stranger", 40

        then:
        result == "Hello Stranger, your number is 40"
    }

    def "should successfully call method with named parameters"() {
        when:
        String result = sub.callMeWithNamedParameters(name: 'Marie', number: 41)

        then:
        result == "Hello Marie, your number is 41"
    }

    def "should successfully use default argument"() {
        when:
        int result = sub.methodWithDefaultArgument(2)

        then:
        result == 6
    }


}
