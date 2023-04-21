package programmerzamannow.jenkins

class Output {
    static def hello(String name) {
        println("Hello ${name}")
    }

    static def hello_param(steps, String name) {
        steps.echo("Hello ${name}")
    }
}