import org.junit.Test
import org.junit.FixMethodOrder
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestAllExercises : AbstractTestExercises() {

  @Test
  fun `test#000 HelloWorld Exercise#1`() = testClass(helloWorldExercise1.TestHelloWorldExercise1::class)

  @Test
  fun `test#001 HelloWorld Exercise#2`() = testOutput("../AtomicKotlinCourse/Programming Basics/Hello, World!/Exercise 2/test/output.txt"){ helloWorldExercise2.main() }

  @Test
  fun `test#002 HelloWorld Exercise#3`() = testOutput("../AtomicKotlinCourse/Programming Basics/Hello, World!/Exercise 3/test/output.txt"){ helloWorldExercise3.main() }

  @Test
  fun `test#003 VarAndVal Exercise#1`() = testOutput("../AtomicKotlinCourse/Programming Basics/var & val/Exercise 1/test/output.txt"){ varAndValExercise1.main() }

  @Test
  fun `test#004 VarAndVal Exercise#2`() = testOutput("../AtomicKotlinCourse/Programming Basics/var & val/Exercise 2/test/output.txt"){ varAndValExercise2.main() }

  @Test
  fun `test#005 VarAndVal Exercise#3`() = testOutput("../AtomicKotlinCourse/Programming Basics/var & val/Exercise 3/test/output.txt"){ varAndValExercise3.main() }

  @Test
  fun `test#006 DataTypes Exercise#1`() = testClass(dataTypesExercise1.TestDataTypesExercise1::class)

  @Test
  fun `test#007 DataTypes Exercise#2`() = testOutput("../AtomicKotlinCourse/Programming Basics/Data Types/Exercise 2/test/output.txt"){ dataTypesExercise2.main() }

  @Test
  fun `test#008 DataTypes Exercise#3`() = testClass(dataTypesExercise3.TestDataTypesExercise3::class)

  @Test
  fun `test#009 Functions Exercise#1`() = testClass(functionsExercise1.TestFunctionsExercise1::class)

  @Test
  fun `test#010 Functions Exercise#2`() = testClass(functionsExercise2.TestFunctionsExercise2::class)

  @Test
  fun `test#011 Functions Exercise#3`() = testClass(functionsExercise3.TestFunctionsExercise3::class)

  @Test
  fun `test#012 IfExpressions Exercise#1`() = testClass(ifExpressionsExercise1.TestIfExpressionsExercise1::class)

  @Test
  fun `test#013 IfExpressions Exercise#2`() = testClass(ifExpressionsExercise2.TestIfExpressionsExercise2::class)

  @Test
  fun `test#014 IfExpressions Exercise#3`() = testClass(ifExpressionsExercise3.TestIfExpressionsExercise3::class)

  @Test
  fun `test#015 StringTemplates Exercise#1`() = testOutput("../AtomicKotlinCourse/Programming Basics/String Templates/Exercise 1/test/output.txt"){ stringTemplatesExercise1.main() }

  @Test
  fun `test#016 StringTemplates Exercise#2`() = testClass(stringTemplatesExercise2.TestStringTemplatesExercise2::class)

  @Test
  fun `test#017 StringTemplates Exercise#3`() = testClass(stringTemplatesExercise3.TestStringTemplatesExercise3::class)

  @Test
  fun `test#018 NumberTypes Exercise#1`() = testClass(numberTypesExercise1.TestNumberTypesExercise1::class)

  @Test
  fun `test#019 NumberTypes Exercise#2`() = testClass(numberTypesExercise2.TestNumberTypesExercise2::class)

  @Test
  fun `test#020 NumberTypes Exercise#3`() = testClass(numberTypesExercise3.TestNumberTypesExercise3::class)

  @Test
  fun `test#021 NumberTypes Exercise#4`() = testClass(numberTypesExercise4.TestNumberTypesExercise4::class)

  @Test
  fun `test#022 Booleans Exercise#1`() = testClass(booleansExercise1.TestBooleansExercise1::class)

  @Test
  fun `test#023 Booleans Exercise#2`() = testClass(booleansExercise2.TestBooleansExercise2::class)

  @Test
  fun `test#024 Booleans Exercise#3`() = testClass(booleansExercise3.TestBooleansExercise3::class)

  @Test
  fun `test#025 RepetitionWithWhile Exercise#1`() = testClass(repetitionWithWhileExercise1.TestRepetitionWithWhileExercise1::class)

  @Test
  fun `test#026 RepetitionWithWhile Exercise#2`() = testClass(repetitionWithWhileExercise2.TestRepetitionWithWhileExercise2::class)

  @Test
  fun `test#027 RepetitionWithWhile Exercise#3`() = testClass(repetitionWithWhileExercise3.TestRepetitionWithWhileExercise3::class)

  @Test
  fun `test#028 LoopingAndRanges Exercise#1`() = testClass(loopingAndRangesExercise1.TestLoopingAndRangesExercise1::class)

  @Test
  fun `test#029 LoopingAndRanges Exercise#2`() = testClass(loopingAndRangesExercise2.TestLoopingAndRangesExercise2::class)

  @Test
  fun `test#030 LoopingAndRanges Exercise#3`() = testClass(loopingAndRangesExercise3.TestLoopingAndRangesExercise3::class)

  @Test
  fun `test#031 LoopingAndRanges Exercise#4`() = testClass(loopingAndRangesExercise4.TestLoopingAndRangesExercise4::class)

  @Test
  fun `test#032 TheInKeyword Exercise#1`() = testClass(theInKeywordExercise1.TestTheInKeywordExercise1::class)

  @Test
  fun `test#033 TheInKeyword Exercise#2`() = testClass(theInKeywordExercise2.TestTheInKeywordExercise2::class)

  @Test
  fun `test#034 TheInKeyword Exercise#3`() = testClass(theInKeywordExercise3.TestTheInKeywordExercise3::class)

  @Test
  fun `test#035 TheInKeyword Exercise#4`() = testClass(theInKeywordExercise4.TestTheInKeywordExercise4::class)

  @Test
  fun `test#036 ExpressionsAndStatements Exercise#1`() = testOutput("../AtomicKotlinCourse/Programming Basics/Expressions & Statements/Exercise 1/test/output.txt"){ expressionsAndStatementsExercise1.main() }

  @Test
  fun `test#037 ExpressionsAndStatements Exercise#2`() = testClass(expressionsAndStatementsExercise2.TestExpressionsAndStatementsExercise2::class)

  @Test
  fun `test#038 ExpressionsAndStatements Exercise#3`() = testClass(expressionsAndStatementsExercise3.TestExpressionsAndStatementsExercise3::class)

  @Test
  fun `test#039 SummaryI Exercise#1`() = testOutput("../AtomicKotlinCourse/Programming Basics/Summary 1/Exercise 1/test/output.txt"){ summaryIExercise1.main() }

  @Test
  fun `test#040 SummaryI Exercise#2`() = testClass(summaryIExercise2.TestSummaryIExercise2::class)

  @Test
  fun `test#041 SummaryI Exercise#3`() = testClass(summaryIExercise3.TestSummaryIExercise3::class)

  @Test
  fun `test#042 SummaryI Exercise#4`() = testClass(summaryIExercise4.TestSummaryIExercise4::class)

  @Test
  fun `test#043 SummaryI Exercise#5`() = testClass(summaryIExercise5.TestSummaryIExercise5::class)

  @Test
  fun `test#044 SummaryI Exercise#6`() = testClass(summaryIExercise6.TestSummaryIExercise6::class)

  @Test
  fun `test#045 SummaryI Exercise#7`() = testClass(summaryIExercise7.TestSummaryIExercise7::class)

  @Test
  fun `test#046 SummaryI Exercise#8`() = testClass(summaryIExercise8.TestSummaryIExercise8::class)

  @Test
  fun `test#047 SummaryI Exercise#9`() = testClass(summaryIExercise9.TestSummaryIExercise9::class)

  @Test
  fun `test#048 SummaryI Exercise#10`() = testClass(summaryIExercise10.TestSummaryIExercise10::class)

  @Test
  fun `test#049 ObjectsEverywhere Exercise#1`() = testClass(objectsEverywhereExercise1.TestObjectsEverywhereExercise1::class)

  @Test
  fun `test#050 ObjectsEverywhere Exercise#2`() = testClass(objectsEverywhereExercise2.TestObjectsEverywhereExercise2::class)

  @Test
  fun `test#051 ObjectsEverywhere Exercise#3`() = testClass(objectsEverywhereExercise3.TestObjectsEverywhereExercise3::class)

  @Test
  fun `test#052 ObjectsEverywhere Exercise#4`() = testClass(objectsEverywhereExercise4.TestObjectsEverywhereExercise4::class)

  @Test
  fun `test#053 CreatingClasses Exercise#1`() = testClass(creatingClassesExercise1.TestCreatingClassesExercise1::class)

  @Test
  fun `test#054 CreatingClasses Exercise#2`() = testClass(creatingClassesExercise2.TestCreatingClassesExercise2::class)

  @Test
  fun `test#055 CreatingClasses Exercise#3`() = testClass(creatingClassesExercise3.TestCreatingClassesExercise3::class)

  @Test
  fun `test#056 Properties Exercise#1`() = testClass(propertiesExercise1.TestPropertiesExercise1::class)

  @Test
  fun `test#057 Properties Exercise#2`() = testClass(propertiesExercise2.TestPropertiesExercise2::class)

  @Test
  fun `test#058 Properties Exercise#3`() = testClass(propertiesExercise3.TestPropertiesExercise3::class)

  @Test
  fun `test#059 Constructors Exercise#1`() = testClass(constructorsExercise1.TestConstructorsExercise1::class)

  @Test
  fun `test#060 Constructors Exercise#2`() = testClass(constructorsExercise2.TestConstructorsExercise2::class)

  @Test
  fun `test#061 Constructors Exercise#3`() = testClass(constructorsExercise3.TestConstructorsExercise3::class)

  @Test
  fun `test#062 ConstrainingVisibility Exercise#1`() = testClass(constrainingVisibilityExercise1.TestConstrainingVisibilityExercise1::class)

  @Test
  fun `test#063 ConstrainingVisibility Exercise#2`() = testClass(constrainingVisibilityExercise2.TestConstrainingVisibilityExercise2::class)

  @Test
  fun `test#064 ConstrainingVisibility Exercise#3`() = testClass(constrainingVisibilityExercise3.TestConstrainingVisibilityExercise3::class)

  @Test
  fun `test#065 Packages Exercise#1`() = testClass(packagesExercise1.TestPackagesExercise1::class)

  @Test
  fun `test#066 Packages Exercise#2`() = testClass(packagesExercise2.TestPackagesExercise2::class)

  @Test
  fun `test#067 Packages Exercise#3`() = testClass(packagesExercise3.TestPackagesExercise3::class)

  @Test
  fun `test#068 Testing Exercise#1`() = testClass(testingExercise1.TestTestingExercise1::class)

  @Test
  fun `test#069 Testing Exercise#2`() = testClass(testingExercise2.TestTestingExercise2::class)

  @Test
  fun `test#070 Testing Exercise#3`() = testClass(testingExercise3.TestTestingExercise3::class)

  @Test
  fun `test#071 Exceptions Exercise#1`() = testClass(exceptionsExercise1.TestExceptionsExercise1::class)

  @Test
  fun `test#072 Exceptions Exercise#2`() = testClass(exceptionsExercise2.TestExceptionsExercise2::class)

  @Test
  fun `test#073 Exceptions Exercise#3`() = testClass(exceptionsExercise3.TestExceptionsExercise3::class)

  @Test
  fun `test#074 Lists Exercise#1`() = testClass(listsExercise1.TestListsExercise1::class)

  @Test
  fun `test#075 Lists Exercise#2`() = testClass(listsExercise2.TestListsExercise2::class)

  @Test
  fun `test#076 Lists Exercise#3`() = testClass(listsExercise3.TestListsExercise3::class)

  @Test
  fun `test#077 VariableArgumentLists Exercise#1`() = testClass(variableArgumentListsExercise1.TestVariableArgumentListsExercise1::class)

  @Test
  fun `test#078 VariableArgumentLists Exercise#2`() = testClass(variableArgumentListsExercise2.TestVariableArgumentListsExercise2::class)

  @Test
  fun `test#079 VariableArgumentLists Exercise#3`() = testClass(variableArgumentListsExercise3.TestVariableArgumentListsExercise3::class)

  @Test
  fun `test#080 VariableArgumentLists Exercise#4`() = testClass(variableArgumentListsExercise4.TestVariableArgumentListsExercise4::class)

  @Test
  fun `test#081 Sets Exercise#1`() = testClass(setsExercise1.TestSetsExercise1::class)

  @Test
  fun `test#082 Sets Exercise#2`() = testClass(setsExercise2.TestSetsExercise2::class)

  @Test
  fun `test#083 Sets Exercise#3`() = testClass(setsExercise3.TestSetsExercise3::class)

  @Test
  fun `test#084 Maps Exercise#1`() = testClass(mapsExercise1.TestMapsExercise1::class)

  @Test
  fun `test#085 Maps Exercise#2`() = testClass(mapsExercise2.TestMapsExercise2::class)

  @Test
  fun `test#086 Maps Exercise#3`() = testClass(mapsExercise3.TestMapsExercise3::class)

  @Test
  fun `test#087 PropertyAccessors Exercise#1`() = testClass(propertyAccessorsExercise1.TestPropertyAccessorsExercise1::class)

  @Test
  fun `test#088 PropertyAccessors Exercise#2`() = testClass(propertyAccessorsExercise2.TestPropertyAccessorsExercise2::class)

  @Test
  fun `test#089 PropertyAccessors Exercise#3`() = testClass(propertyAccessorsExercise3.TestPropertyAccessorsExercise3::class)

  @Test
  fun `test#090 PropertyAccessors Exercise#4`() = testClass(propertyAccessorsExercise4.TestPropertyAccessorsExercise4::class)

  @Test
  fun `test#091 SummaryII Exercise#1`() = testClass(summaryIIExercise1.TestSummaryIIExercise1::class)

  @Test
  fun `test#092 SummaryII Exercise#2`() = testClass(summaryIIExercise2.TestSummaryIIExercise2::class)

  @Test
  fun `test#093 SummaryII Exercise#3`() = testClass(summaryIIExercise3.TestSummaryIIExercise3::class)

  @Test
  fun `test#094 SummaryII Exercise#4`() = testClass(summaryIIExercise4.TestSummaryIIExercise4::class)

  @Test
  fun `test#095 SummaryII Exercise#5`() = testClass(summaryIIExercise5.TestSummaryIIExercise5::class)

  @Test
  fun `test#096 SummaryII Exercise#6`() = testClass(summaryIIExercise6.TestSummaryIIExercise6::class)

  @Test
  fun `test#097 SummaryII Exercise#7`() = testClass(summaryIIExercise7.TestSummaryIIExercise7::class)

  @Test
  fun `test#098 SummaryII Exercise#8`() = testClass(summaryIIExercise8.TestSummaryIIExercise8::class)

  @Test
  fun `test#099 ExtensionFunctions Exercise#1`() = testClass(extensionFunctionsExercise1.TestExtensionFunctionsExercise1::class)

  @Test
  fun `test#100 ExtensionFunctions Exercise#2`() = testClass(extensionFunctionsExercise2.TestExtensionFunctionsExercise2::class)

  @Test
  fun `test#101 ExtensionFunctions Exercise#3`() = testClass(extensionFunctionsExercise3.TestExtensionFunctionsExercise3::class)

  @Test
  fun `test#102 NamedAndDefaultArguments Exercise#1`() = testClass(namedAndDefaultArgumentsExercise1.TestNamedAndDefaultArgumentsExercise1::class)

  @Test
  fun `test#103 NamedAndDefaultArguments Exercise#2`() = testClass(namedAndDefaultArgumentsExercise2.TestNamedAndDefaultArgumentsExercise2::class)

  @Test
  fun `test#104 NamedAndDefaultArguments Exercise#3`() = testClass(namedAndDefaultArgumentsExercise3.TestNamedAndDefaultArgumentsExercise3::class)

  @Test
  fun `test#105 Overloading Exercise#1`() = testClass(overloadingExercise1.TestOverloadingExercise1::class)

  @Test
  fun `test#106 Overloading Exercise#2`() = testClass(overloadingExercise2.TestOverloadingExercise2::class)

  @Test
  fun `test#107 Overloading Exercise#3`() = testClass(overloadingExercise3.TestOverloadingExercise3::class)

  @Test
  fun `test#108 WhenExpressions Exercise#1`() = testClass(whenExpressionsExercise1.TestWhenExpressionsExercise1::class)

  @Test
  fun `test#109 WhenExpressions Exercise#2`() = testClass(whenExpressionsExercise2.TestWhenExpressionsExercise2::class)

  @Test
  fun `test#110 WhenExpressions Exercise#3`() = testClass(whenExpressionsExercise3.TestWhenExpressionsExercise3::class)

  @Test
  fun `test#111 Enumerations Exercise#1`() = testClass(enumerationsExercise1.TestEnumerationsExercise1::class)

  @Test
  fun `test#112 Enumerations Exercise#2`() = testClass(enumerationsExercise2.TestEnumerationsExercise2::class)

  @Test
  fun `test#113 Enumerations Exercise#3`() = testClass(enumerationsExercise3.TestEnumerationsExercise3::class)

  @Test
  fun `test#114 DataClasses Exercise#1`() = testClass(dataClassesExercise1.TestDataClassesExercise1::class)

  @Test
  fun `test#115 DataClasses Exercise#2`() = testClass(dataClassesExercise2.TestDataClassesExercise2::class)

  @Test
  fun `test#116 DataClasses Exercise#3`() = testClass(dataClassesExercise3.TestDataClassesExercise3::class)

  @Test
  fun `test#117 DestructuringDeclarations Exercise#1`() = testClass(destructuringDeclarationsExercise1.TestDestructuringDeclarationsExercise1::class)

  @Test
  fun `test#118 DestructuringDeclarations Exercise#2`() = testClass(destructuringDeclarationsExercise2.TestDestructuringDeclarationsExercise2::class)

  @Test
  fun `test#119 DestructuringDeclarations Exercise#3`() = testClass(destructuringDeclarationsExercise3.TestDestructuringDeclarationsExercise3::class)

  @Test
  fun `test#120 NullableTypes Exercise#1`() = testClass(nullableTypesExercise1.TestNullableTypesExercise1::class)

  @Test
  fun `test#121 NullableTypes Exercise#2`() = testClass(nullableTypesExercise2.TestNullableTypesExercise2::class)

  @Test
  fun `test#122 NullableTypes Exercise#3`() = testClass(nullableTypesExercise3.TestNullableTypesExercise3::class)

  @Test
  fun `test#123 SafeCallsAndTheElvisOperator Exercise#1`() = testClass(safeCallsAndTheElvisOperatorExercise1.TestSafeCallsAndTheElvisOperatorExercise1::class)

  @Test
  fun `test#124 SafeCallsAndTheElvisOperator Exercise#2`() = testClass(safeCallsAndTheElvisOperatorExercise2.TestSafeCallsAndTheElvisOperatorExercise2::class)

  @Test
  fun `test#125 SafeCallsAndTheElvisOperator Exercise#3`() = testClass(safeCallsAndTheElvisOperatorExercise3.TestSafeCallsAndTheElvisOperatorExercise3::class)

  @Test
  fun `test#126 NonNullAssertions Exercise#1`() = testClass(nonNullAssertionsExercise1.TestNonNullAssertionsExercise1::class)

  @Test
  fun `test#127 NonNullAssertions Exercise#2`() = testClass(nonNullAssertionsExercise2.TestNonNullAssertionsExercise2::class)

  @Test
  fun `test#128 NonNullAssertions Exercise#3`() = testClass(nonNullAssertionsExercise3.TestNonNullAssertionsExercise3::class)

  @Test
  fun `test#129 ExtensionsForNullableTypes Exercise#1`() = testClass(extensionsForNullableTypesExercise1.TestExtensionsForNullableTypesExercise1::class)

  @Test
  fun `test#130 ExtensionsForNullableTypes Exercise#2`() = testClass(extensionsForNullableTypesExercise2.TestExtensionsForNullableTypesExercise2::class)

  @Test
  fun `test#131 ExtensionsForNullableTypes Exercise#3`() = testClass(extensionsForNullableTypesExercise3.TestExtensionsForNullableTypesExercise3::class)

  @Test
  fun `test#132 IntroductionToGenerics Exercise#1`() = testClass(introductionToGenericsExercise1.TestIntroductionToGenericsExercise1::class)

  @Test
  fun `test#133 IntroductionToGenerics Exercise#2`() = testClass(introductionToGenericsExercise2.TestIntroductionToGenericsExercise2::class)

  @Test
  fun `test#134 IntroductionToGenerics Exercise#3`() = testClass(introductionToGenericsExercise3.TestIntroductionToGenericsExercise3::class)

  @Test
  fun `test#135 ExtensionProperties Exercise#1`() = testClass(extensionPropertiesExercise1.TestExtensionPropertiesExercise1::class)

  @Test
  fun `test#136 ExtensionProperties Exercise#2`() = testClass(extensionPropertiesExercise2.TestExtensionPropertiesExercise2::class)

  @Test
  fun `test#137 ExtensionProperties Exercise#3`() = testClass(extensionPropertiesExercise3.TestExtensionPropertiesExercise3::class)

  @Test
  fun `test#138 BreakAndContinue Exercise#1`() = testClass(breakAndContinueExercise1.TestBreakAndContinueExercise1::class)

  @Test
  fun `test#139 BreakAndContinue Exercise#2`() = testClass(breakAndContinueExercise2.TestBreakAndContinueExercise2::class)

  @Test
  fun `test#140 BreakAndContinue Exercise#3`() = testClass(breakAndContinueExercise3.TestBreakAndContinueExercise3::class)

  @Test
  fun `test#141 Lambdas Exercise#1`() = testClass(lambdasExercise1.TestLambdasExercise1::class)

  @Test
  fun `test#142 Lambdas Exercise#2`() = testClass(lambdasExercise2.TestLambdasExercise2::class)

  @Test
  fun `test#143 Lambdas Exercise#3`() = testClass(lambdasExercise3.TestLambdasExercise3::class)

  @Test
  fun `test#144 TheImportanceOfLambdas Exercise#1`() = testClass(theImportanceOfLambdasExercise1.TestTheImportanceOfLambdasExercise1::class)

  @Test
  fun `test#145 TheImportanceOfLambdas Exercise#2`() = testClass(theImportanceOfLambdasExercise2.TestTheImportanceOfLambdasExercise2::class)

  @Test
  fun `test#146 TheImportanceOfLambdas Exercise#3`() = testClass(theImportanceOfLambdasExercise3.TestTheImportanceOfLambdasExercise3::class)

  @Test
  fun `test#147 OperationsOnCollections Exercise#1`() = testClass(operationsOnCollectionsExercise1.TestOperationsOnCollectionsExercise1::class)

  @Test
  fun `test#148 OperationsOnCollections Exercise#2`() = testClass(operationsOnCollectionsExercise2.TestOperationsOnCollectionsExercise2::class)

  @Test
  fun `test#149 OperationsOnCollections Exercise#3`() = testClass(operationsOnCollectionsExercise3.TestOperationsOnCollectionsExercise3::class)

  @Test
  fun `test#150 OperationsOnCollections Exercise#4`() = testClass(operationsOnCollectionsExercise4.TestOperationsOnCollectionsExercise4::class)

  @Test
  fun `test#151 MemberReferences Exercise#1`() = testClass(memberReferencesExercise1.TestMemberReferencesExercise1::class)

  @Test
  fun `test#152 MemberReferences Exercise#2`() = testClass(memberReferencesExercise2.TestMemberReferencesExercise2::class)

  @Test
  fun `test#153 MemberReferences Exercise#3`() = testClass(memberReferencesExercise3.TestMemberReferencesExercise3::class)

  @Test
  fun `test#154 HigherOrderFunctions Exercise#1`() = testClass(higherOrderFunctionsExercise1.TestHigherOrderFunctionsExercise1::class)

  @Test
  fun `test#155 HigherOrderFunctions Exercise#2`() = testClass(higherOrderFunctionsExercise2.TestHigherOrderFunctionsExercise2::class)

  @Test
  fun `test#156 HigherOrderFunctions Exercise#3`() = testClass(higherOrderFunctionsExercise3.TestHigherOrderFunctionsExercise3::class)

  @Test
  fun `test#157 HigherOrderFunctions Exercise#4`() = testClass(higherOrderFunctionsExercise4.TestHigherOrderFunctionsExercise4::class)

  @Test
  fun `test#158 ManipulatingLists Exercise#1`() = testClass(manipulatingListsExercise1.TestManipulatingListsExercise1::class)

  @Test
  fun `test#159 ManipulatingLists Exercise#2`() = testClass(manipulatingListsExercise2.TestManipulatingListsExercise2::class)

  @Test
  fun `test#160 ManipulatingLists Exercise#3`() = testClass(manipulatingListsExercise3.TestManipulatingListsExercise3::class)

  @Test
  fun `test#161 ManipulatingLists Exercise#4`() = testClass(manipulatingListsExercise4.TestManipulatingListsExercise4::class)

  @Test
  fun `test#162 ManipulatingLists Exercise#5`() = testClass(manipulatingListsExercise5.TestManipulatingListsExercise5::class)

  @Test
  fun `test#163 ManipulatingLists Exercise#6`() = testClass(manipulatingListsExercise6.TestManipulatingListsExercise6::class)

  @Test
  fun `test#164 ManipulatingLists Exercise#7`() = testClass(manipulatingListsExercise7.TestManipulatingListsExercise7::class)

  @Test
  fun `test#165 BuildingMaps Exercise#1`() = testClass(buildingMapsExercise1.TestBuildingMapsExercise1::class)

  @Test
  fun `test#166 BuildingMaps Exercise#2`() = testClass(buildingMapsExercise2.TestBuildingMapsExercise2::class)

  @Test
  fun `test#167 BuildingMaps Exercise#3`() = testClass(buildingMapsExercise3.TestBuildingMapsExercise3::class)

  @Test
  fun `test#168 Sequences Exercise#1`() = testClass(sequencesExercise1.TestSequencesExercise1::class)

  @Test
  fun `test#169 Sequences Exercise#2`() = testClass(sequencesExercise2.TestSequencesExercise2::class)

  @Test
  fun `test#170 Sequences Exercise#3`() = testClass(sequencesExercise3.TestSequencesExercise3::class)

  @Test
  fun `test#171 Sequences Exercise#4`() = testClass(sequencesExercise4.TestSequencesExercise4::class)

  @Test
  fun `test#172 Sequences Exercise#5`() = testClass(sequencesExercise5.TestSequencesExercise5::class)

  @Test
  fun `test#173 Sequences Exercise#6`() = testClass(sequencesExercise6.TestSequencesExercise6::class)

  @Test
  fun `test#174 Sequences Exercise#7`() = testClass(sequencesExercise7.TestSequencesExercise7::class)

  @Test
  fun `test#175 Sequences Exercise#8`() = testClass(sequencesExercise8.TestSequencesExercise8::class)

  @Test
  fun `test#176 LocalFunctions Exercise#1`() = testClass(localFunctionsExercise1.TestLocalFunctionsExercise1::class)

  @Test
  fun `test#177 LocalFunctions Exercise#2`() = testClass(localFunctionsExercise2.TestLocalFunctionsExercise2::class)

  @Test
  fun `test#178 LocalFunctions Exercise#3`() = testClass(localFunctionsExercise3.TestLocalFunctionsExercise3::class)

  @Test
  fun `test#179 FoldingLists Exercise#1`() = testClass(foldingListsExercise1.TestFoldingListsExercise1::class)

  @Test
  fun `test#180 FoldingLists Exercise#2`() = testClass(foldingListsExercise2.TestFoldingListsExercise2::class)

  @Test
  fun `test#181 FoldingLists Exercise#3`() = testClass(foldingListsExercise3.TestFoldingListsExercise3::class)

  @Test
  fun `test#182 FoldingLists Exercise#4`() = testClass(foldingListsExercise4.TestFoldingListsExercise4::class)

  @Test
  fun `test#183 Recursion Exercise#1`() = testClass(recursionExercise1.TestRecursionExercise1::class)

  @Test
  fun `test#184 Recursion Exercise#2`() = testClass(recursionExercise2.TestRecursionExercise2::class)

  @Test
  fun `test#185 Recursion Exercise#3`() = testClass(recursionExercise3.TestRecursionExercise3::class)

  @Test
  fun `test#186 Recursion Exercise#4`() = testClass(recursionExercise4.TestRecursionExercise4::class)

  @Test
  fun `test#187 Interfaces Exercise#1`() = testClass(interfacesExercise1.TestInterfacesExercise1::class)

  @Test
  fun `test#188 Interfaces Exercise#2`() = testClass(interfacesExercise2.TestInterfacesExercise2::class)

  @Test
  fun `test#189 Interfaces Exercise#3`() = testClass(interfacesExercise3.TestInterfacesExercise3::class)

  @Test
  fun `test#190 ComplexConstructors Exercise#1`() = testClass(complexConstructorsExercise1.TestComplexConstructorsExercise1::class)

  @Test
  fun `test#191 ComplexConstructors Exercise#2`() = testClass(complexConstructorsExercise2.TestComplexConstructorsExercise2::class)

  @Test
  fun `test#192 ComplexConstructors Exercise#3`() = testClass(complexConstructorsExercise3.TestComplexConstructorsExercise3::class)

  @Test
  fun `test#193 SecondaryConstructors Exercise#1`() = testClass(secondaryConstructorsExercise1.TestSecondaryConstructorsExercise1::class)

  @Test
  fun `test#194 SecondaryConstructors Exercise#2`() = testClass(secondaryConstructorsExercise2.TestSecondaryConstructorsExercise2::class)

  @Test
  fun `test#195 SecondaryConstructors Exercise#3`() = testClass(secondaryConstructorsExercise3.TestSecondaryConstructorsExercise3::class)

  @Test
  fun `test#196 Inheritance Exercise#1`() = testClass(inheritanceExercise1.TestInheritanceExercise1::class)

  @Test
  fun `test#197 Inheritance Exercise#2`() = testClass(inheritanceExercise2.TestInheritanceExercise2::class)

  @Test
  fun `test#198 Inheritance Exercise#3`() = testClass(inheritanceExercise3.TestInheritanceExercise3::class)

  @Test
  fun `test#199 BaseClassInitialization Exercise#1`() = testClass(baseClassInitializationExercise1.TestBaseClassInitializationExercise1::class)

  @Test
  fun `test#200 BaseClassInitialization Exercise#2`() = testClass(baseClassInitializationExercise2.TestBaseClassInitializationExercise2::class)

  @Test
  fun `test#201 AbstractClasses Exercise#1`() = testClass(abstractClassesExercise1.TestAbstractClassesExercise1::class)

  @Test
  fun `test#202 AbstractClasses Exercise#2`() = testClass(abstractClassesExercise2.TestAbstractClassesExercise2::class)

  @Test
  fun `test#203 Upcasting Exercise#1`() = testClass(upcastingExercise1.TestUpcastingExercise1::class)

  @Test
  fun `test#204 Upcasting Exercise#2`() = testClass(upcastingExercise2.TestUpcastingExercise2::class)

  @Test
  fun `test#205 Upcasting Exercise#3`() = testClass(upcastingExercise3.TestUpcastingExercise3::class)

  @Test
  fun `test#206 Polymorphism Exercise#1`() = testClass(polymorphismExercise1.TestPolymorphismExercise1::class)

  @Test
  fun `test#207 Polymorphism Exercise#2`() = testClass(polymorphismExercise2.TestPolymorphismExercise2::class)

  @Test
  fun `test#208 Composition Exercise#1`() = testClass(compositionExercise1.TestCompositionExercise1::class)

  @Test
  fun `test#209 Composition Exercise#2`() = testClass(compositionExercise2.TestCompositionExercise2::class)

  @Test
  fun `test#210 Composition Exercise#3`() = testClass(compositionExercise3.TestCompositionExercise3::class)

  @Test
  fun `test#211 InheritanceAndExtensions Exercise#1`() = testClass(inheritanceAndExtensionsExercise1.TestInheritanceAndExtensionsExercise1::class)

  @Test
  fun `test#212 InheritanceAndExtensions Exercise#2`() = testClass(inheritanceAndExtensionsExercise2.TestInheritanceAndExtensionsExercise2::class)

  @Test
  fun `test#213 InheritanceAndExtensions Exercise#3`() = testClass(inheritanceAndExtensionsExercise3.TestInheritanceAndExtensionsExercise3::class)

  @Test
  fun `test#214 ClassDelegation Exercise#1`() = testClass(classDelegationExercise1.TestClassDelegationExercise1::class)

  @Test
  fun `test#215 ClassDelegation Exercise#2`() = testClass(classDelegationExercise2.TestClassDelegationExercise2::class)

  @Test
  fun `test#216 ClassDelegation Exercise#3`() = testClass(classDelegationExercise3.TestClassDelegationExercise3::class)

  @Test
  fun `test#217 Downcasting Exercise#1`() = testClass(downcastingExercise1.TestDowncastingExercise1::class)

  @Test
  fun `test#218 Downcasting Exercise#2`() = testClass(downcastingExercise2.TestDowncastingExercise2::class)

  @Test
  fun `test#219 Downcasting Exercise#3`() = testClass(downcastingExercise3.TestDowncastingExercise3::class)

  @Test
  fun `test#220 SealedClasses Exercise#1`() = testClass(sealedClassesExercise1.TestSealedClassesExercise1::class)

  @Test
  fun `test#221 SealedClasses Exercise#2`() = testClass(sealedClassesExercise2.TestSealedClassesExercise2::class)

  @Test
  fun `test#222 SealedClasses Exercise#3`() = testClass(sealedClassesExercise3.TestSealedClassesExercise3::class)

  @Test
  fun `test#223 NestedClasses Exercise#1`() = testClass(nestedClassesExercise1.TestNestedClassesExercise1::class)

  @Test
  fun `test#224 NestedClasses Exercise#2`() = testClass(nestedClassesExercise2.TestNestedClassesExercise2::class)

  @Test
  fun `test#225 NestedClasses Exercise#3`() = testClass(nestedClassesExercise3.TestNestedClassesExercise3::class)

  @Test
  fun `test#226 NestedClasses Exercise#4`() = testClass(nestedClassesExercise4.TestNestedClassesExercise4::class)

  @Test
  fun `test#227 InnerClasses Exercise#1`() = testClass(innerClassesExercise1.TestInnerClassesExercise1::class)

  @Test
  fun `test#228 InnerClasses Exercise#2`() = testClass(innerClassesExercise2.TestInnerClassesExercise2::class)

  @Test
  fun `test#229 InnerClasses Exercise#3`() = testClass(innerClassesExercise3.TestInnerClassesExercise3::class)

  @Test
  fun `test#230 Objects Exercise#1`() = testClass(objectsExercise1.TestObjectsExercise1::class)

  @Test
  fun `test#231 Objects Exercise#2`() = testClass(objectsExercise2.TestObjectsExercise2::class)

  @Test
  fun `test#232 Objects Exercise#3`() = testClass(objectsExercise3.TestObjectsExercise3::class)

  @Test
  fun `test#233 CompanionObjects Exercise#1`() = testClass(companionObjectsExercise1.TestCompanionObjectsExercise1::class)

  @Test
  fun `test#234 CompanionObjects Exercise#2`() = testClass(companionObjectsExercise2.TestCompanionObjectsExercise2::class)

  @Test
  fun `test#235 CompanionObjects Exercise#3`() = testClass(companionObjectsExercise3.TestCompanionObjectsExercise3::class)

  @Test
  fun `test#236 ObjectOrientedDesign Exercise#1`() = testClass(objectOrientedDesignExercise1.TestObjectOrientedDesignExercise1::class)

  @Test
  fun `test#237 ObjectOrientedDesign Exercise#2`() = testClass(objectOrientedDesignExercise2.TestObjectOrientedDesignExercise2::class)

  @Test
  fun `test#238 ObjectOrientedDesign Exercise#3`() = testClass(objectOrientedDesignExercise3.TestObjectOrientedDesignExercise3::class)

  @Test
  fun `test#239 LambdaWithReceiver Exercise#1`() = testClass(lambdaWithReceiverExercise1.TestLambdaWithReceiverExercise1::class)

  @Test
  fun `test#240 LambdaWithReceiver Exercise#2`() = testClass(lambdaWithReceiverExercise2.TestLambdaWithReceiverExercise2::class)

  @Test
  fun `test#241 TheWithFunction Exercise#1`() = testClass(theWithFunctionExercise1.TestTheWithFunctionExercise1::class)

  @Test
  fun `test#242 TheWithFunction Exercise#2`() = testClass(theWithFunctionExercise2.TestTheWithFunctionExercise2::class)

  @Test
  fun `test#243 ScopeFunctions Exercise#1`() = testClass(scopeFunctionsExercise1.TestScopeFunctionsExercise1::class)

  @Test
  fun `test#244 ScopeFunctions Exercise#2`() = testClass(scopeFunctionsExercise2.TestScopeFunctionsExercise2::class)

  @Test
  fun `test#245 ScopeFunctions Exercise#3`() = testClass(scopeFunctionsExercise3.TestScopeFunctionsExercise3::class)

  @Test
  fun `test#246 Hashing Exercise#1`() = testClass(hashingExercise1.TestHashingExercise1::class)
}