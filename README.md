# Unit Test Naming Conventions

## Naming your tests
The name of your test should consist of three parts:

* The name of the method being tested.
* The scenario under which it's being tested.
* The expected behavior when the scenario is invoked.

### Why ? 
Naming standards are important because they explicitly express the intent of the test. 
Tests are more than just making sure your code works, they also provide documentation. 
Just by looking at the suite of unit tests, 
you should be able to infer the behavior of your code without even looking at the code itself. 
Additionally, when tests fail, you can see exactly which scenarios don't meet your expectations.


##  Popular Unit Test Naming Conventions

* MethodName_StateUnderTest_ExpectedBehavior
* -- MethodName_ExpectedBehavior_StateUnderTest
* test[Feature being tested]
* Feature to be tested
* Should_ExpectedBehavior_When_StateUnderTest
* When_StateUnderTest_Expect_ExpectedBehavior
* Given_Preconditions_When_StateUnderTest_Then_ExpectedBehavior