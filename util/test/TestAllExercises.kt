import org.junit.Test

class TestAllExercises : AbstractTestExercises() {

  @Test
  fun testHelloWorldExercise1() = testOutput("../AtomicKotlinCourse/Programming Basics/Hello, World!/Exercise 1/test/output.txt"){ helloWorldExercise1.main() }

  @Test
  fun testHelloWorldExercise2() = testOutput("../AtomicKotlinCourse/Programming Basics/Hello, World!/Exercise 2/test/output.txt"){ helloWorldExercise2.main() }

  @Test
  fun testHelloWorldExercise3() = testOutput("../AtomicKotlinCourse/Programming Basics/Hello, World!/Exercise 3/test/output.txt"){ helloWorldExercise3.main() }

  @Test
  fun testVarAndValExercise1() = testOutput("../AtomicKotlinCourse/Programming Basics/var & val/Exercise 1/test/output.txt"){ varAndValExercise1.main() }

  @Test
  fun testVarAndValExercise2() = testOutput("../AtomicKotlinCourse/Programming Basics/var & val/Exercise 2/test/output.txt"){ varAndValExercise2.main() }

  @Test
  fun testVarAndValExercise3() = testOutput("../AtomicKotlinCourse/Programming Basics/var & val/Exercise 3/test/output.txt"){ varAndValExercise3.main() }

  @Test
  fun testDataTypesExercise1() = testClass(dataTypesExercise1.TestDataTypesExercise1::class)

  @Test
  fun testDataTypesExercise2() = testClass(dataTypesExercise2.TestDataTypesExercise2::class)

  @Test
  fun testDataTypesExercise3() = testClass(dataTypesExercise3.TestDataTypesExercise3::class)

  @Test
  fun testFunctionsExercise1() = testClass(functionsExercise1.TestFunctionsExercise1::class)

  @Test
  fun testFunctionsExercise2() = testClass(functionsExercise2.TestFunctionsExercise2::class)

  @Test
  fun testFunctionsExercise3() = testClass(functionsExercise3.TestFunctionsExercise3::class)

  @Test
  fun testIfExpressionsExercise1() = testClass(ifExpressionsExercise1.TestIfExpressionsExercise1::class)

  @Test
  fun testIfExpressionsExercise2() = testClass(ifExpressionsExercise2.TestIfExpressionsExercise2::class)

  @Test
  fun testIfExpressionsExercise3() = testClass(ifExpressionsExercise3.TestIfExpressionsExercise3::class)

  @Test
  fun testStringTemplatesExercise1() = testOutput("../AtomicKotlinCourse/Programming Basics/String Templates/Exercise 1/test/output.txt"){ stringTemplatesExercise1.main() }

  @Test
  fun testStringTemplatesExercise2() = testClass(stringTemplatesExercise2.TestStringTemplatesExercise2::class)

  @Test
  fun testStringTemplatesExercise3() = testClass(stringTemplatesExercise3.TestStringTemplatesExercise3::class)

  @Test
  fun testNumberTypesExercise1() = testClass(numberTypesExercise1.TestNumberTypesExercise1::class)

  @Test
  fun testNumberTypesExercise2() = testClass(numberTypesExercise2.TestNumberTypesExercise2::class)

  @Test
  fun testNumberTypesExercise3() = testClass(numberTypesExercise3.TestNumberTypesExercise3::class)

  @Test
  fun testNumberTypesExercise4() = testClass(numberTypesExercise4.TestNumberTypesExercise4::class)

  @Test
  fun testBooleansExercise1() = testClass(booleansExercise1.TestBooleansExercise1::class)

  @Test
  fun testBooleansExercise2() = testClass(booleansExercise2.TestBooleansExercise2::class)

  @Test
  fun testBooleansExercise3() = testClass(booleansExercise3.TestBooleansExercise3::class)

  @Test
  fun testRepetitionWithWhileExercise1() = testClass(repetitionWithWhileExercise1.TestRepetitionWithWhileExercise1::class)

  @Test
  fun testRepetitionWithWhileExercise2() = testClass(repetitionWithWhileExercise2.TestRepetitionWithWhileExercise2::class)

  @Test
  fun testRepetitionWithWhileExercise3() = testClass(repetitionWithWhileExercise3.TestRepetitionWithWhileExercise3::class)

  @Test
  fun testLoopingAndRangesExercise1() = testClass(loopingAndRangesExercise1.TestLoopingAndRangesExercise1::class)

  @Test
  fun testLoopingAndRangesExercise2() = testClass(loopingAndRangesExercise2.TestLoopingAndRangesExercise2::class)

  @Test
  fun testLoopingAndRangesExercise3() = testClass(loopingAndRangesExercise3.TestLoopingAndRangesExercise3::class)

  @Test
  fun testLoopingAndRangesExercise4() = testClass(loopingAndRangesExercise4.TestLoopingAndRangesExercise4::class)

  @Test
  fun testTheInKeywordExercise1() = testClass(theInKeywordExercise1.TestTheInKeywordExercise1::class)

  @Test
  fun testTheInKeywordExercise2() = testClass(theInKeywordExercise2.TestTheInKeywordExercise2::class)

  @Test
  fun testTheInKeywordExercise3() = testClass(theInKeywordExercise3.TestTheInKeywordExercise3::class)

  @Test
  fun testTheInKeywordExercise4() = testClass(theInKeywordExercise4.TestTheInKeywordExercise4::class)

  @Test
  fun testExpressionsAndStatementsExercise1() = testOutput("../AtomicKotlinCourse/Programming Basics/Expressions & Statements/Exercise 1/test/output.txt"){ expressionsAndStatementsExercise1.main() }

  @Test
  fun testExpressionsAndStatementsExercise2() = testClass(expressionsAndStatementsExercise2.TestExpressionsAndStatementsExercise2::class)

  @Test
  fun testExpressionsAndStatementsExercise3() = testClass(expressionsAndStatementsExercise3.TestExpressionsAndStatementsExercise3::class)

  @Test
  fun testSummaryIExercise1() = testClass(summaryIExercise1.TestSummaryIExercise1::class)

  @Test
  fun testSummaryIExercise2() = testOutput("../AtomicKotlinCourse/Programming Basics/Summary 1/Exercise 2/test/output.txt"){ summaryIExercise2.main() }

  @Test
  fun testSummaryIExercise3() = testClass(summaryIExercise3.TestSummaryIExercise3::class)

  @Test
  fun testSummaryIExercise4() = testClass(summaryIExercise4.TestSummaryIExercise4::class)

  @Test
  fun testSummaryIExercise5() = testClass(summaryIExercise5.TestSummaryIExercise5::class)

  @Test
  fun testSummaryIExercise6() = testClass(summaryIExercise6.TestSummaryIExercise6::class)

  @Test
  fun testSummaryIExercise7() = testClass(summaryIExercise7.TestSummaryIExercise7::class)

  @Test
  fun testSummaryIExercise8() = testClass(summaryIExercise8.TestSummaryIExercise8::class)

  @Test
  fun testSummaryIExercise9() = testClass(summaryIExercise9.TestSummaryIExercise9::class)

  @Test
  fun testSummaryIExercise10() = testClass(summaryIExercise10.TestSummaryIExercise10::class)

  @Test
  fun testSummaryIExercise11() = testClass(summaryIExercise11.TestSummaryIExercise11::class)

  @Test
  fun testSummaryIExercise12() = testClass(summaryIExercise12.TestSummaryIExercise12::class)

  @Test
  fun testSummaryIExercise13() = testClass(summaryIExercise13.TestSummaryIExercise13::class)

  @Test
  fun testObjectsEverywhereExercise1() = testClass(objectsEverywhereExercise1.TestObjectsEverywhereExercise1::class)

  @Test
  fun testObjectsEverywhereExercise2() = testClass(objectsEverywhereExercise2.TestObjectsEverywhereExercise2::class)

  @Test
  fun testObjectsEverywhereExercise3() = testClass(objectsEverywhereExercise3.TestObjectsEverywhereExercise3::class)

  @Test
  fun testObjectsEverywhereExercise4() = testClass(objectsEverywhereExercise4.TestObjectsEverywhereExercise4::class)

  @Test
  fun testCreatingClassesExercise1() = testClass(creatingClassesExercise1.TestCreatingClassesExercise1::class)

  @Test
  fun testCreatingClassesExercise2() = testClass(creatingClassesExercise2.TestCreatingClassesExercise2::class)

  @Test
  fun testCreatingClassesExercise3() = testClass(creatingClassesExercise3.TestCreatingClassesExercise3::class)

  @Test
  fun testPropertiesExercise1() = testClass(propertiesExercise1.TestPropertiesExercise1::class)

  @Test
  fun testPropertiesExercise2() = testClass(propertiesExercise2.TestPropertiesExercise2::class)

  @Test
  fun testPropertiesExercise3() = testClass(propertiesExercise3.TestPropertiesExercise3::class)

  @Test
  fun testConstructorsExercise1() = testClass(constructorsExercise1.TestConstructorsExercise1::class)

  @Test
  fun testConstructorsExercise2() = testClass(constructorsExercise2.TestConstructorsExercise2::class)

  @Test
  fun testConstructorsExercise3() = testClass(constructorsExercise3.TestConstructorsExercise3::class)

  @Test
  fun testConstrainingVisibilityExercise1() = testClass(constrainingVisibilityExercise1.TestConstrainingVisibilityExercise1::class)

  @Test
  fun testConstrainingVisibilityExercise2() = testClass(constrainingVisibilityExercise2.TestConstrainingVisibilityExercise2::class)

  @Test
  fun testConstrainingVisibilityExercise3() = testClass(constrainingVisibilityExercise3.TestConstrainingVisibilityExercise3::class)

  @Test
  fun testPackagesExercise1() = testClass(packagesExercise1.TestPackagesExercise1::class)

  @Test
  fun testPackagesExercise2() = testClass(packagesExercise2.TestPackagesExercise2::class)

  @Test
  fun testPackagesExercise3() = testClass(packagesExercise3.TestPackagesExercise3::class)

  @Test
  fun testTestingExercise1() = testClass(testingExercise1.TestTestingExercise1::class)

  @Test
  fun testTestingExercise2() = testClass(testingExercise2.TestTestingExercise2::class)

  @Test
  fun testTestingExercise3() = testClass(testingExercise3.TestTestingExercise3::class)

  @Test
  fun testExceptionsExercise1() = testClass(exceptionsExercise1.TestExceptionsExercise1::class)

  @Test
  fun testExceptionsExercise2() = testClass(exceptionsExercise2.TestExceptionsExercise2::class)

  @Test
  fun testExceptionsExercise3() = testClass(exceptionsExercise3.TestExceptionsExercise3::class)

  @Test
  fun testListsExercise1() = testClass(listsExercise1.TestListsExercise1::class)

  @Test
  fun testListsExercise2() = testClass(listsExercise2.TestListsExercise2::class)

  @Test
  fun testListsExercise3() = testClass(listsExercise3.TestListsExercise3::class)

  @Test
  fun testListsExercise4() = testClass(listsExercise4.TestListsExercise4::class)

  @Test
  fun testVariableArgumentListsExercise1() = testClass(variableArgumentListsExercise1.TestVariableArgumentListsExercise1::class)

  @Test
  fun testVariableArgumentListsExercise2() = testClass(variableArgumentListsExercise2.TestVariableArgumentListsExercise2::class)

  @Test
  fun testVariableArgumentListsExercise3() = testClass(variableArgumentListsExercise3.TestVariableArgumentListsExercise3::class)

  @Test
  fun testVariableArgumentListsExercise4() = testClass(variableArgumentListsExercise4.TestVariableArgumentListsExercise4::class)

  @Test
  fun testVariableArgumentListsExercise5() = testClass(variableArgumentListsExercise5.TestVariableArgumentListsExercise5::class)

  @Test
  fun testSetsExercise1() = testClass(setsExercise1.TestSetsExercise1::class)

  @Test
  fun testSetsExercise2() = testClass(setsExercise2.TestSetsExercise2::class)

  @Test
  fun testSetsExercise3() = testClass(setsExercise3.TestSetsExercise3::class)

  @Test
  fun testMapsExercise1() = testClass(mapsExercise1.TestMapsExercise1::class)

  @Test
  fun testMapsExercise2() = testClass(mapsExercise2.TestMapsExercise2::class)

  @Test
  fun testMapsExercise3() = testClass(mapsExercise3.TestMapsExercise3::class)

  @Test
  fun testPropertyAccessorsExercise1() = testClass(propertyAccessorsExercise1.TestPropertyAccessorsExercise1::class)

  @Test
  fun testPropertyAccessorsExercise2() = testClass(propertyAccessorsExercise2.TestPropertyAccessorsExercise2::class)

  @Test
  fun testPropertyAccessorsExercise3() = testClass(propertyAccessorsExercise3.TestPropertyAccessorsExercise3::class)

  @Test
  fun testPropertyAccessorsExercise4() = testClass(propertyAccessorsExercise4.TestPropertyAccessorsExercise4::class)

  @Test
  fun testSummaryIIExercise1() = testClass(summaryIIExercise1.TestSummaryIIExercise1::class)

  @Test
  fun testSummaryIIExercise2() = testClass(summaryIIExercise2.TestSummaryIIExercise2::class)

  @Test
  fun testSummaryIIExercise3() = testClass(summaryIIExercise3.TestSummaryIIExercise3::class)

  @Test
  fun testSummaryIIExercise4() = testClass(summaryIIExercise4.TestSummaryIIExercise4::class)

  @Test
  fun testSummaryIIExercise5() = testClass(summaryIIExercise5.TestSummaryIIExercise5::class)

  @Test
  fun testSummaryIIExercise6() = testClass(summaryIIExercise6.TestSummaryIIExercise6::class)

  @Test
  fun testSummaryIIExercise7() = testClass(summaryIIExercise7.TestSummaryIIExercise7::class)

  @Test
  fun testSummaryIIExercise8() = testClass(summaryIIExercise8.TestSummaryIIExercise8::class)

  @Test
  fun testSummaryIIExercise9() = testClass(summaryIIExercise9.TestSummaryIIExercise9::class)

  @Test
  fun testSummaryIIExercise10() = testClass(summaryIIExercise10.TestSummaryIIExercise10::class)

  @Test
  fun testSummaryIIExercise11() = testClass(summaryIIExercise11.TestSummaryIIExercise11::class)

  @Test
  fun testSummaryIIExercise12() = testClass(summaryIIExercise12.TestSummaryIIExercise12::class)

  @Test
  fun testSummaryIIExercise13() = testClass(summaryIIExercise13.TestSummaryIIExercise13::class)

  @Test
  fun testSummaryIIExercise14() = testClass(summaryIIExercise14.TestSummaryIIExercise14::class)

  @Test
  fun testBreakAndContinueExercise1() = testOutput("../AtomicKotlinCourse/Usability/break & continue/Exercise 1/test/output.txt"){ breakAndContinueExercise1.main() }

  @Test
  fun testBreakAndContinueExercise2() = testClass(breakAndContinueExercise2.TestBreakAndContinueExercise2::class)

  @Test
  fun testBreakAndContinueExercise3() = testClass(breakAndContinueExercise3.TestBreakAndContinueExercise3::class)

  @Test
  fun testExtensionFunctionsExercise1() = testClass(extensionFunctionsExercise1.TestExtensionFunctionsExercise1::class)

  @Test
  fun testExtensionFunctionsExercise2() = testClass(extensionFunctionsExercise2.TestExtensionFunctionsExercise2::class)

  @Test
  fun testExtensionFunctionsExercise3() = testClass(extensionFunctionsExercise3.TestExtensionFunctionsExercise3::class)

  @Test
  fun testNamedAndDefaultArgumentsExercise1() = testClass(namedAndDefaultArgumentsExercise1.TestNamedAndDefaultArgumentsExercise1::class)

  @Test
  fun testNamedAndDefaultArgumentsExercise2() = testClass(namedAndDefaultArgumentsExercise2.TestNamedAndDefaultArgumentsExercise2::class)

  @Test
  fun testNamedAndDefaultArgumentsExercise3() = testClass(namedAndDefaultArgumentsExercise3.TestNamedAndDefaultArgumentsExercise3::class)

  @Test
  fun testOverloadingExercise1() = testClass(overloadingExercise1.TestOverloadingExercise1::class)

  @Test
  fun testOverloadingExercise2() = testClass(overloadingExercise2.TestOverloadingExercise2::class)

  @Test
  fun testOverloadingExercise3() = testClass(overloadingExercise3.TestOverloadingExercise3::class)

  @Test
  fun testWhenExpressionsExercise1() = testClass(whenExpressionsExercise1.TestWhenExpressionsExercise1::class)

  @Test
  fun testWhenExpressionsExercise2() = testClass(whenExpressionsExercise2.TestWhenExpressionsExercise2::class)

  @Test
  fun testWhenExpressionsExercise3() = testClass(whenExpressionsExercise3.TestWhenExpressionsExercise3::class)

  @Test
  fun testEnumerationsExercise1() = testClass(enumerationsExercise1.TestEnumerationsExercise1::class)

  @Test
  fun testEnumerationsExercise2() = testClass(enumerationsExercise2.TestEnumerationsExercise2::class)

  @Test
  fun testEnumerationsExercise3() = testClass(enumerationsExercise3.TestEnumerationsExercise3::class)

  @Test
  fun testDataClassesExercise1() = testClass(dataClassesExercise1.TestDataClassesExercise1::class)

  @Test
  fun testDataClassesExercise2() = testClass(dataClassesExercise2.TestDataClassesExercise2::class)

  @Test
  fun testNullableTypesExercise1() = testClass(nullableTypesExercise1.TestNullableTypesExercise1::class)

  @Test
  fun testNullableTypesExercise2() = testClass(nullableTypesExercise2.TestNullableTypesExercise2::class)

  @Test
  fun testSafeCallsAndTheElvisOperatorExercise1() = testClass(safeCallsAndTheElvisOperatorExercise1.TestSafeCallsAndTheElvisOperatorExercise1::class)

  @Test
  fun testSafeCallsAndTheElvisOperatorExercise2() = testClass(safeCallsAndTheElvisOperatorExercise2.TestSafeCallsAndTheElvisOperatorExercise2::class)

  @Test
  fun testNonNullAssertionsExercise1() = testClass(nonNullAssertionsExercise1.TestNonNullAssertionsExercise1::class)

  @Test
  fun testNonNullAssertionsExercise2() = testClass(nonNullAssertionsExercise2.TestNonNullAssertionsExercise2::class)

  @Test
  fun testExtensionsForNullableTypesExercise1() = testClass(extensionsForNullableTypesExercise1.TestExtensionsForNullableTypesExercise1::class)

  @Test
  fun testExtensionsForNullableTypesExercise2() = testClass(extensionsForNullableTypesExercise2.TestExtensionsForNullableTypesExercise2::class)

  @Test
  fun testIntroductionToGenericsExercise1() = testClass(introductionToGenericsExercise1.TestIntroductionToGenericsExercise1::class)

  @Test
  fun testIntroductionToGenericsExercise2() = testClass(introductionToGenericsExercise2.TestIntroductionToGenericsExercise2::class)

  @Test
  fun testExtensionPropertiesExercise1() = testClass(extensionPropertiesExercise1.TestExtensionPropertiesExercise1::class)

  @Test
  fun testLambdasExercise1() = testClass(lambdasExercise1.TestLambdasExercise1::class)

  @Test
  fun testLambdasExercise2() = testClass(lambdasExercise2.TestLambdasExercise2::class)

  @Test
  fun testLambdasExercise3() = testClass(lambdasExercise3.TestLambdasExercise3::class)

  @Test
  fun testTheImportanceOfLambdasExercise1() = testClass(theImportanceOfLambdasExercise1.TestTheImportanceOfLambdasExercise1::class)

  @Test
  fun testTheImportanceOfLambdasExercise2() = testClass(theImportanceOfLambdasExercise2.TestTheImportanceOfLambdasExercise2::class)

  @Test
  fun testTheImportanceOfLambdasExercise3() = testClass(theImportanceOfLambdasExercise3.TestTheImportanceOfLambdasExercise3::class)

  @Test
  fun testOperationsOnCollectionsExercise1() = testClass(operationsOnCollectionsExercise1.TestOperationsOnCollectionsExercise1::class)

  @Test
  fun testOperationsOnCollectionsExercise2() = testClass(operationsOnCollectionsExercise2.TestOperationsOnCollectionsExercise2::class)

  @Test
  fun testOperationsOnCollectionsExercise3() = testClass(operationsOnCollectionsExercise3.TestOperationsOnCollectionsExercise3::class)

  @Test
  fun testOperationsOnCollectionsExercise4() = testClass(operationsOnCollectionsExercise4.TestOperationsOnCollectionsExercise4::class)

  @Test
  fun testMemberReferencesExercise1() = testClass(memberReferencesExercise1.TestMemberReferencesExercise1::class)

  @Test
  fun testMemberReferencesExercise2() = testClass(memberReferencesExercise2.TestMemberReferencesExercise2::class)

  @Test
  fun testFunctionTypesExercise1() = testClass(functionTypesExercise1.TestFunctionTypesExercise1::class)

  @Test
  fun testFunctionTypesExercise2() = testClass(functionTypesExercise2.TestFunctionTypesExercise2::class)

  @Test
  fun testFunctionTypesExercise3() = testClass(functionTypesExercise3.TestFunctionTypesExercise3::class)

  @Test
  fun testFunctionTypesExercise4() = testClass(functionTypesExercise4.TestFunctionTypesExercise4::class)

  @Test
  fun testManipulatingListsExercise1() = testClass(manipulatingListsExercise1.TestManipulatingListsExercise1::class)

  @Test
  fun testManipulatingListsExercise2() = testClass(manipulatingListsExercise2.TestManipulatingListsExercise2::class)

  @Test
  fun testManipulatingListsExercise3() = testClass(manipulatingListsExercise3.TestManipulatingListsExercise3::class)

  @Test
  fun testManipulatingListsExercise4() = testClass(manipulatingListsExercise4.TestManipulatingListsExercise4::class)

  @Test
  fun testManipulatingListsExercise5() = testClass(manipulatingListsExercise5.TestManipulatingListsExercise5::class)

  @Test
  fun testManipulatingListsExercise6() = testClass(manipulatingListsExercise6.TestManipulatingListsExercise6::class)

  @Test
  fun testManipulatingListsExercise7() = testClass(manipulatingListsExercise7.TestManipulatingListsExercise7::class)

  @Test
  fun testFromListsToMapsExercise1() = testClass(fromListsToMapsExercise1.TestFromListsToMapsExercise1::class)

  @Test
  fun testFromListsToMapsExercise2() = testClass(fromListsToMapsExercise2.TestFromListsToMapsExercise2::class)

  @Test
  fun testFromListsToMapsExercise3() = testClass(fromListsToMapsExercise3.TestFromListsToMapsExercise3::class)

  @Test
  fun testSequencesExercise1() = testClass(sequencesExercise1.TestSequencesExercise1::class)

  @Test
  fun testSequencesExercise2() = testClass(sequencesExercise2.TestSequencesExercise2::class)

  @Test
  fun testSequencesExercise3() = testClass(sequencesExercise3.TestSequencesExercise3::class)

  @Test
  fun testSequencesExercise4() = testClass(sequencesExercise4.TestSequencesExercise4::class)

  @Test
  fun testSequencesExercise5() = testClass(sequencesExercise5.TestSequencesExercise5::class)

  @Test
  fun testMoreLibraryFunctionsExercise1() = testClass(moreLibraryFunctionsExercise1.TestMoreLibraryFunctionsExercise1::class)

  @Test
  fun testMoreLibraryFunctionsExercise2() = testClass(moreLibraryFunctionsExercise2.TestMoreLibraryFunctionsExercise2::class)

  @Test
  fun testFunctionsInsideFunctionsExercise1() = testClass(functionsInsideFunctionsExercise1.TestFunctionsInsideFunctionsExercise1::class)

  @Test
  fun testFoldingListsExercise1() = testClass(foldingListsExercise1.TestFoldingListsExercise1::class)

  @Test
  fun testFoldingListsExercise2() = testClass(foldingListsExercise2.TestFoldingListsExercise2::class)

  @Test
  fun testFoldingListsExercise3() = testClass(foldingListsExercise3.TestFoldingListsExercise3::class)

  @Test
  fun testFoldingListsExercise4() = testClass(foldingListsExercise4.TestFoldingListsExercise4::class)

  @Test
  fun testRecursionExercise1() = testClass(recursionExercise1.TestRecursionExercise1::class)

  @Test
  fun testRecursionExercise2() = testClass(recursionExercise2.TestRecursionExercise2::class)

  @Test
  fun testRecursionExercise3() = testClass(recursionExercise3.TestRecursionExercise3::class)

  @Test
  fun testRecursionExercise4() = testClass(recursionExercise4.TestRecursionExercise4::class)

  @Test
  fun testInterfacesExercise1() = testClass(interfacesExercise1.TestInterfacesExercise1::class)

  @Test
  fun testComplexConstructorsExercise1() = testClass(complexConstructorsExercise1.TestComplexConstructorsExercise1::class)

  @Test
  fun testSecondaryConstructorsExercise1() = testClass(secondaryConstructorsExercise1.TestSecondaryConstructorsExercise1::class)

  @Test
  fun testInheritanceExercise1() = testClass(inheritanceExercise1.TestInheritanceExercise1::class)

  @Test
  fun testBaseClassInitializationExercise1() = testClass(baseClassInitializationExercise1.TestBaseClassInitializationExercise1::class)

  @Test
  fun testAbstractClassesExercise1() = testClass(abstractClassesExercise1.TestAbstractClassesExercise1::class)

  @Test
  fun testLambdaWithReceiverExercise1() = testClass(lambdaWithReceiverExercise1.TestLambdaWithReceiverExercise1::class)

  @Test
  fun testLambdaWithReceiverExercise2() = testClass(lambdaWithReceiverExercise2.TestLambdaWithReceiverExercise2::class)

  @Test
  fun testTheWithFunctionExercise1() = testClass(theWithFunctionExercise1.TestTheWithFunctionExercise1::class)

  @Test
  fun testTheWithFunctionExercise2() = testClass(theWithFunctionExercise2.TestTheWithFunctionExercise2::class)

  @Test
  fun testHashingExercise1() = testClass(hashingExercise1.TestHashingExercise1::class)
}