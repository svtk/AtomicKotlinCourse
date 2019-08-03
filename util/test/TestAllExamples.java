import org.junit.Test;

public class TestAllExamples extends AbstractTestExamples {
    @Test
    public void testEmptyProgram() {
        testExample("../AtomicKotlinCourse/Programming Basics/Hello, World!/Examples/src/EmptyProgram.kt", EmptyProgramKt::main);
    }

    @Test
    public void testHelloWorld() {
        testExample("../AtomicKotlinCourse/Programming Basics/Hello, World!/Examples/src/HelloWorld.kt", HelloWorldKt::main);
    }

    @Test
    public void testVals() {
        testExample("../AtomicKotlinCourse/Programming Basics/var & val/Examples/src/Vals.kt", ValsKt::main);
    }

    @Test
    public void testVars() {
        testExample("../AtomicKotlinCourse/Programming Basics/var & val/Examples/src/Vars.kt", VarsKt::main);
    }

    @Test
    public void testAVarIsMutable() {
        testExample("../AtomicKotlinCourse/Programming Basics/var & val/Examples/src/AVarIsMutable.kt", AVarIsMutableKt::main);
    }

    @Test
    public void testInference() {
        testExample("../AtomicKotlinCourse/Programming Basics/Data Types/Examples/src/Inference.kt", InferenceKt::main);
    }

    @Test
    public void testStringPlusNumber() {
        testExample("../AtomicKotlinCourse/Programming Basics/Data Types/Examples/src/StringPlusNumber.kt", StringPlusNumberKt::main);
    }

    @Test
    public void testTypes() {
        testExample("../AtomicKotlinCourse/Programming Basics/Data Types/Examples/src/Types.kt", TypesKt::main);
    }

    @Test
    public void testSayHello() {
        testExample("../AtomicKotlinCourse/Programming Basics/Functions/Examples/src/SayHello.kt", SayHelloKt::main);
    }

    @Test
    public void testMultiplyByThree() {
        testExample("../AtomicKotlinCourse/Programming Basics/Functions/Examples/src/MultiplyByThree.kt", MultiplyByThreeKt::main);
    }

    @Test
    public void testMultiplyByTwo() {
        testExample("../AtomicKotlinCourse/Programming Basics/Functions/Examples/src/MultiplyByTwo.kt", MultiplyByTwoKt::main);
    }

    @Test
    public void testMultiplyByFour() {
        testExample("../AtomicKotlinCourse/Programming Basics/Functions/Examples/src/MultiplyByFour.kt", MultiplyByFourKt::main);
    }

    @Test
    public void testIf3() {
        testExample("../AtomicKotlinCourse/Programming Basics/if Expressions/Examples/src/If3.kt", If3Kt::main);
    }

    @Test
    public void testIf2() {
        testExample("../AtomicKotlinCourse/Programming Basics/if Expressions/Examples/src/If2.kt", If2Kt::main);
    }

    @Test
    public void testIf6() {
        testExample("../AtomicKotlinCourse/Programming Basics/if Expressions/Examples/src/If6.kt", If6Kt::main);
    }

    @Test
    public void testOneOrTheOther() {
        testExample("../AtomicKotlinCourse/Programming Basics/if Expressions/Examples/src/OneOrTheOther.kt", OneOrTheOtherKt::main);
    }

    @Test
    public void testTrueOrFalse() {
        testExample("../AtomicKotlinCourse/Programming Basics/if Expressions/Examples/src/TrueOrFalse.kt", TrueOrFalseKt::main);
    }

    @Test
    public void testIf1() {
        testExample("../AtomicKotlinCourse/Programming Basics/if Expressions/Examples/src/If1.kt", If1Kt::main);
    }

    @Test
    public void testIf5() {
        testExample("../AtomicKotlinCourse/Programming Basics/if Expressions/Examples/src/If5.kt", If5Kt::main);
    }

    @Test
    public void testIf4() {
        testExample("../AtomicKotlinCourse/Programming Basics/if Expressions/Examples/src/If4.kt", If4Kt::main);
    }

    @Test
    public void testStringTemplates() {
        testExample("../AtomicKotlinCourse/Programming Basics/String Templates/Examples/src/StringTemplates.kt", StringTemplatesKt::main);
    }

    @Test
    public void testExpressionInTemplate() {
        testExample("../AtomicKotlinCourse/Programming Basics/String Templates/Examples/src/ExpressionInTemplate.kt", ExpressionInTemplateKt::main);
    }

    @Test
    public void testStringConcatenation() {
        testExample("../AtomicKotlinCourse/Programming Basics/String Templates/Examples/src/StringConcatenation.kt", StringConcatenationKt::main);
    }

    @Test
    public void testTripleQuotes() {
        testExample("../AtomicKotlinCourse/Programming Basics/String Templates/Examples/src/TripleQuotes.kt", TripleQuotesKt::main);
    }

    @Test
    public void testIntegerOverflow() {
        testExample("../AtomicKotlinCourse/Programming Basics/Number Types/Examples/src/IntegerOverflow.kt", IntegerOverflowKt::main);
    }

    @Test
    public void testBMIMetric() {
        testExample("../AtomicKotlinCourse/Programming Basics/Number Types/Examples/src/BMIMetric.kt", BMIMetricKt::main);
    }

    @Test
    public void testModulus() {
        testExample("../AtomicKotlinCourse/Programming Basics/Number Types/Examples/src/Modulus.kt", ModulusKt::main);
    }

    @Test
    public void testUsingLongs() {
        testExample("../AtomicKotlinCourse/Programming Basics/Number Types/Examples/src/UsingLongs.kt", UsingLongsKt::main);
    }

    @Test
    public void testIntDivisionTruncates() {
        testExample("../AtomicKotlinCourse/Programming Basics/Number Types/Examples/src/IntDivisionTruncates.kt", IntDivisionTruncatesKt::main);
    }

    @Test
    public void testLongConstants() {
        testExample("../AtomicKotlinCourse/Programming Basics/Number Types/Examples/src/LongConstants.kt", LongConstantsKt::main);
    }

    @Test
    public void testOpOrder() {
        testExample("../AtomicKotlinCourse/Programming Basics/Number Types/Examples/src/OpOrder.kt", OpOrderKt::main);
    }

    @Test
    public void testInferInt() {
        testExample("../AtomicKotlinCourse/Programming Basics/Number Types/Examples/src/InferInt.kt", InferIntKt::main);
    }

    @Test
    public void testBiggestLong() {
        testExample("../AtomicKotlinCourse/Programming Basics/Number Types/Examples/src/BiggestLong.kt", BiggestLongKt::main);
    }

    @Test
    public void testBMIEnglish() {
        testExample("../AtomicKotlinCourse/Programming Basics/Number Types/Examples/src/BMIEnglish.kt", BMIEnglishKt::main);
    }

    @Test
    public void testOpOrderParens() {
        testExample("../AtomicKotlinCourse/Programming Basics/Number Types/Examples/src/OpOrderParens.kt", OpOrderParensKt::main);
    }

    @Test
    public void testClosed() {
        testExample("../AtomicKotlinCourse/Programming Basics/Booleans/Examples/src/Closed.kt", ClosedKt::main);
    }

    @Test
    public void testOpen2() {
        testExample("../AtomicKotlinCourse/Programming Basics/Booleans/Examples/src/Open2.kt", Open2Kt::main);
    }

    @Test
    public void testOpen1() {
        testExample("../AtomicKotlinCourse/Programming Basics/Booleans/Examples/src/Open1.kt", Open1Kt::main);
    }

    @Test
    public void testEvaluationOrder() {
        testExample("../AtomicKotlinCourse/Programming Basics/Booleans/Examples/src/EvaluationOrder.kt", EvaluationOrderKt::main);
    }

    @Test
    public void testDoWhileLoop() {
        testExample("../AtomicKotlinCourse/Programming Basics/Repetition with while/Examples/src/DoWhileLoop.kt", DoWhileLoopKt::main);
    }

    @Test
    public void testIncrementOperator() {
        testExample("../AtomicKotlinCourse/Programming Basics/Repetition with while/Examples/src/IncrementOperator.kt", IncrementOperatorKt::main);
    }

    @Test
    public void testWhileLoop() {
        testExample("../AtomicKotlinCourse/Programming Basics/Repetition with while/Examples/src/WhileLoop.kt", WhileLoopKt::main);
    }

    @Test
    public void testAssignmentOperators() {
        testExample("../AtomicKotlinCourse/Programming Basics/Repetition with while/Examples/src/AssignmentOperators.kt", AssignmentOperatorsKt::main);
    }

    @Test
    public void testDefiningRanges() {
        testExample("../AtomicKotlinCourse/Programming Basics/Looping & Ranges/Examples/src/DefiningRanges.kt", DefiningRangesKt::main);
    }

    @Test
    public void testIterateOverString() {
        testExample("../AtomicKotlinCourse/Programming Basics/Looping & Ranges/Examples/src/IterateOverString.kt", IterateOverStringKt::main);
    }

    @Test
    public void testForWithRanges() {
        testExample("../AtomicKotlinCourse/Programming Basics/Looping & Ranges/Examples/src/ForWithRanges.kt", ForWithRangesKt::main);
    }

    @Test
    public void testRepeat() {
        testExample("../AtomicKotlinCourse/Programming Basics/Looping & Ranges/Examples/src/Repeat.kt", RepeatKt::main);
    }

    @Test
    public void testSumUsingRange() {
        testExample("../AtomicKotlinCourse/Programming Basics/Looping & Ranges/Examples/src/SumUsingRange.kt", SumUsingRangeKt::main);
    }

    @Test
    public void testRepeatThreeTimes() {
        testExample("../AtomicKotlinCourse/Programming Basics/Looping & Ranges/Examples/src/RepeatThreeTimes.kt", RepeatThreeTimesKt::main);
    }

    @Test
    public void testAddingIntToChar() {
        testExample("../AtomicKotlinCourse/Programming Basics/Looping & Ranges/Examples/src/AddingIntToChar.kt", AddingIntToCharKt::main);
    }

    @Test
    public void testForWithCharRange() {
        testExample("../AtomicKotlinCourse/Programming Basics/Looping & Ranges/Examples/src/ForWithCharRange.kt", ForWithCharRangeKt::main);
    }

    @Test
    public void testHasChar() {
        testExample("../AtomicKotlinCourse/Programming Basics/Looping & Ranges/Examples/src/HasChar.kt", HasCharKt::main);
    }

    @Test
    public void testIndexIntoString() {
        testExample("../AtomicKotlinCourse/Programming Basics/Looping & Ranges/Examples/src/IndexIntoString.kt", IndexIntoStringKt::main);
    }

    @Test
    public void testInString() {
        testExample("../AtomicKotlinCourse/Programming Basics/The in Keyword/Examples/src/InString.kt", InStringKt::main);
    }

    @Test
    public void testStringRange() {
        testExample("../AtomicKotlinCourse/Programming Basics/The in Keyword/Examples/src/StringRange.kt", StringRangeKt::main);
    }

    @Test
    public void testCharRange() {
        testExample("../AtomicKotlinCourse/Programming Basics/The in Keyword/Examples/src/CharRange.kt", CharRangeKt::main);
    }

    @Test
    public void testFloatingPointRange() {
        testExample("../AtomicKotlinCourse/Programming Basics/The in Keyword/Examples/src/FloatingPointRange.kt", FloatingPointRangeKt::main);
    }

    @Test
    public void testMembershipInRange() {
        testExample("../AtomicKotlinCourse/Programming Basics/The in Keyword/Examples/src/MembershipInRange.kt", MembershipInRangeKt::main);
    }

    @Test
    public void testMembershipUsingBounds() {
        testExample("../AtomicKotlinCourse/Programming Basics/The in Keyword/Examples/src/MembershipUsingBounds.kt", MembershipUsingBoundsKt::main);
    }

    @Test
    public void testIterationVsMembership() {
        testExample("../AtomicKotlinCourse/Programming Basics/The in Keyword/Examples/src/IterationVsMembership.kt", IterationVsMembershipKt::main);
    }

    @Test
    public void testForIsAStatement() {
        testExample("../AtomicKotlinCourse/Programming Basics/Expressions & Statements/Examples/src/ForIsAStatement.kt", ForIsAStatementKt::main);
    }

    @Test
    public void testUnitReturnType() {
        testExample("../AtomicKotlinCourse/Programming Basics/Expressions & Statements/Examples/src/UnitReturnType.kt", UnitReturnTypeKt::main);
    }

    @Test
    public void testPostfixVsPrefix() {
        testExample("../AtomicKotlinCourse/Programming Basics/Expressions & Statements/Examples/src/PostfixVsPrefix.kt", PostfixVsPrefixKt::main);
    }

    @Test
    public void testAssigningAnIf() {
        testExample("../AtomicKotlinCourse/Programming Basics/Expressions & Statements/Examples/src/AssigningAnIf.kt", AssigningAnIfKt::main);
    }

    @Test
    public void testConfusing() {
        testExample("../AtomicKotlinCourse/Programming Basics/Expressions & Statements/Examples/src/Confusing.kt", ConfusingKt::main);
    }

    @Test
    public void testDoWhile() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Examples/src/DoWhile.kt", DoWhileKt::main);
    }

    @Test
    public void testWhile() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Examples/src/While.kt", WhileKt::main);
    }

    @Test
    public void testTruncation() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Examples/src/Truncation.kt", TruncationKt::main);
    }

    @Test
    public void testUnitReturn() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Examples/src/UnitReturn.kt", UnitReturnKt::main);
    }

    @Test
    public void testMembership() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Examples/src/Membership.kt", MembershipKt::main);
    }

    @Test
    public void testIfExpression() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Examples/src/IfExpression.kt", IfExpressionKt::main);
    }

    @Test
    public void testStringIteration() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Examples/src/StringIteration.kt", StringIterationKt::main);
    }

    @Test
    public void testStrTemplates() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Examples/src/StrTemplates.kt", StrTemplatesKt::main);
    }

    @Test
    public void testHello() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Examples/src/Hello.kt", HelloKt::main);
    }

    @Test
    public void testBasicFunctions() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Examples/src/BasicFunctions.kt", BasicFunctionsKt::main);
    }

    @Test
    public void testIfResult() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Examples/src/IfResult.kt", IfResultKt::main);
    }

    @Test
    public void testRangeOfInt() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Examples/src/RangeOfInt.kt", RangeOfIntKt::main);
    }

    @Test
    public void testThreeQuotes() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Examples/src/ThreeQuotes.kt", ThreeQuotesKt::main);
    }

    @Test
    public void testNumberTypes() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Examples/src/NumberTypes.kt", NumberTypesKt::main);
    }

    @Test
    public void testOverflow() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Examples/src/Overflow.kt", OverflowKt::main);
    }

    @Test
    public void testBooleans() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Examples/src/Booleans.kt", BooleansKt::main);
    }

    @Test
    public void testStrings() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Objects Everywhere/Examples/src/Strings.kt", StringsKt::main);
    }

    @Test
    public void testNumberConversions() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Objects Everywhere/Examples/src/NumberConversions.kt", NumberConversionsKt::main);
    }

    @Test
    public void testRangeSum() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Objects Everywhere/Examples/src/RangeSum.kt", RangeSumKt::main);
    }

    @Test
    public void testIntRanges() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Objects Everywhere/Examples/src/IntRanges.kt", IntRangesKt::main);
    }

    @Test
    public void testConversion() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Objects Everywhere/Examples/src/Conversion.kt", ConversionKt::main);
    }

    @Test
    public void testAnimals() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Creating Classes/Examples/src/Animals.kt", AnimalsKt::main);
    }

    @Test
    public void testDog() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Creating Classes/Examples/src/Dog.kt", DogKt::main);
    }

    @Test
    public void testCat() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Creating Classes/Examples/src/Cat.kt", CatKt::main);
    }

    @Test
    public void testHamster() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Creating Classes/Examples/src/Hamster.kt", HamsterKt::main);
    }

    @Test
    public void testCup2() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Properties/Examples/src/Cup2.kt", Cup2Kt::main);
    }

    @Test
    public void testAnUnchangingVar() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Properties/Examples/src/AnUnchangingVar.kt", AnUnchangingVarKt::main);
    }

    @Test
    public void testReferences() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Properties/Examples/src/References.kt", ReferencesKt::main);
    }

    @Test
    public void testCup() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Properties/Examples/src/Cup.kt", CupKt::main);
    }

    @Test
    public void testChangingAVal() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Properties/Examples/src/ChangingAVal.kt", ChangingAValKt::main);
    }

    @Test
    public void testDisplayAlienSpecies() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Constructors/Examples/src/DisplayAlienSpecies.kt", DisplayAlienSpeciesKt::main);
    }

    @Test
    public void testGoodAlien() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Constructors/Examples/src/GoodAlien.kt", GoodAlienKt::main);
    }

    @Test
    public void testArg() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Constructors/Examples/src/Arg.kt", ArgKt::main);
    }

    @Test
    public void testBear() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Constructors/Examples/src/Bear.kt", complexconstructors.BearKt::main);
    }

    @Test
    public void testVisibleArgs() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Constructors/Examples/src/VisibleArgs.kt", VisibleArgsKt::main);
    }

    @Test
    public void testMultipleArgs() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Constructors/Examples/src/MultipleArgs.kt", MultipleArgsKt::main);
    }

    @Test
    public void testCookie() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Constraining Visibility/Examples/src/Cookie.kt", CookieKt::main);
    }

    @Test
    public void testMultipleRef() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Constraining Visibility/Examples/src/MultipleRef.kt", MultipleRefKt::main);
    }

    @Test
    public void testObserveAnimals() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Constraining Visibility/Examples/src/ObserveAnimals.kt", ObserveAnimalsKt::main);
    }

    @Test
    public void testImportClass() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Imports & Packages/Examples/src/ImportClass.kt", ImportClassKt::main);
    }

    @Test
    public void testImportNameChange() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Imports & Packages/Examples/src/ImportNameChange.kt", ImportNameChangeKt::main);
    }

    @Test
    public void testImportEverything() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Imports & Packages/Examples/src/ImportEverything.kt", ImportEverythingKt::main);
    }

    @Test
    public void testImportPythagorean() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Imports & Packages/Examples/src/ImportPythagorean.kt", ImportPythagoreanKt::main);
    }

    @Test
    public void testFullyQualify() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Imports & Packages/Examples/src/FullyQualify.kt", FullyQualifyKt::main);
    }

    @Test
    public void testTDDWorks() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Testing/Examples/src/TDDWorks.kt", testing3.TDDWorksKt::main);
    }

    @Test
    public void testTDDStillFails() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Testing/Examples/src/TDDStillFails.kt", testing2.TDDStillFailsKt::main);
    }

    @Test
    public void testTDDFail() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Testing/Examples/src/TDDFail.kt", testing1.TDDFailKt::main);
    }

    @Test
    public void testTestingExample() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Testing/Examples/src/TestingExample.kt", TestingExampleKt::main);
    }

    @Test
    public void testIntroducingNull() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Exceptions/Examples/src/IntroducingNull.kt", IntroducingNullKt::main);
    }

    @Test
    public void testToIntException() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Exceptions/Examples/src/ToIntException.kt", ToIntExceptionKt::main);
    }

    @Test
    public void testAverageIncomeWithNull() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Exceptions/Examples/src/AverageIncomeWithNull.kt", withnull.AverageIncomeWithNullKt::main);
    }

    @Test
    public void testAverageIncomeWithException() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Exceptions/Examples/src/AverageIncomeWithException.kt", properexception.AverageIncomeWithExceptionKt::main);
    }

    @Test
    public void testIntroducingCapture() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Exceptions/Examples/src/IntroducingCapture.kt", IntroducingCaptureKt::main);
    }

    @Test
    public void testAverageIncome() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Exceptions/Examples/src/AverageIncome.kt", firstversion.AverageIncomeKt::main);
    }

    @Test
    public void testMutableList() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Lists/Examples/src/MutableList.kt", MutableListKt::main);
    }

    @Test
    public void testMutListIsList() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Lists/Examples/src/MutListIsList.kt", MutListIsListKt::main);
    }

    @Test
    public void testParameterizedTypes() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Lists/Examples/src/ParameterizedTypes.kt", ParameterizedTypesKt::main);
    }

    @Test
    public void testParameterizedReturn() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Lists/Examples/src/ParameterizedReturn.kt", ParameterizedReturnKt::main);
    }

    @Test
    public void testLists() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Lists/Examples/src/Lists.kt", ListsKt::main);
    }

    @Test
    public void testMultipleListRefs() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Lists/Examples/src/MultipleListRefs.kt", MultipleListRefsKt::main);
    }

    @Test
    public void testListUsefulFunction() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Lists/Examples/src/ListUsefulFunction.kt", ListUsefulFunctionKt::main);
    }

    @Test
    public void testOutOfBounds() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Lists/Examples/src/OutOfBounds.kt", OutOfBoundsKt::main);
    }

    @Test
    public void testVariableArgList() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/vararg Arguments/Examples/src/VariableArgList.kt", VariableArgListKt::main);
    }

    @Test
    public void testListOf() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/vararg Arguments/Examples/src/ListOf.kt", ListOfKt::main);
    }

    @Test
    public void testVarargLikeList() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/vararg Arguments/Examples/src/VarargLikeList.kt", VarargLikeListKt::main);
    }

    @Test
    public void testSpreadOperator() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/vararg Arguments/Examples/src/SpreadOperator.kt", SpreadOperatorKt::main);
    }

    @Test
    public void testMainArgs() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/vararg Arguments/Examples/src/MainArgs.kt", MainArgsKt::main);
    }

    @Test
    public void testVarargSum() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/vararg Arguments/Examples/src/VarargSum.kt", VarargSumKt::main);
    }

    @Test
    public void testTwoFunctionsWithVarargs() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/vararg Arguments/Examples/src/TwoFunctionsWithVarargs.kt", TwoFunctionsWithVarargsKt::main);
    }

    @Test
    public void testMainArgConversion() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/vararg Arguments/Examples/src/MainArgConversion.kt", MainArgConversionKt::main);
    }

    @Test
    public void testMutableSet() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Sets/Examples/src/MutableSet.kt", MutableSetKt::main);
    }

    @Test
    public void testRemoveDuplicates() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Sets/Examples/src/RemoveDuplicates.kt", RemoveDuplicatesKt::main);
    }

    @Test
    public void testSets() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Sets/Examples/src/Sets.kt", SetsKt::main);
    }

    @Test
    public void testGetValue() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Maps/Examples/src/GetValue.kt", GetValueKt::main);
    }

    @Test
    public void testMutableMaps() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Maps/Examples/src/MutableMaps.kt", MutableMapsKt::main);
    }

    @Test
    public void testReadOnlyMaps() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Maps/Examples/src/ReadOnlyMaps.kt", ReadOnlyMapsKt::main);
    }

    @Test
    public void testContactMap() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Maps/Examples/src/ContactMap.kt", ContactMapKt::main);
    }

    @Test
    public void testMaps() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Maps/Examples/src/Maps.kt", MapsKt::main);
    }

    @Test
    public void testDefault() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Property Accessors/Examples/src/Default.kt", DefaultKt::main);
    }

    @Test
    public void testLogChanges() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Property Accessors/Examples/src/LogChanges.kt", LogChangesKt::main);
    }

    @Test
    public void testCounter() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Property Accessors/Examples/src/Counter.kt", propertyaccessors.CounterKt::main);
    }

    @Test
    public void testData() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Property Accessors/Examples/src/Data.kt", propertyaccessors.DataKt::main);
    }

    @Test
    public void testHamsters() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Property Accessors/Examples/src/Hamsters.kt", propertyaccessors.HamstersKt::main);
    }

    @Test
    public void testClassBodies() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/ClassBodies.kt", ClassBodiesKt::main);
    }

    @Test
    public void testUsingAtomicTest() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/UsingAtomicTest.kt", UsingAtomicTestKt::main);
    }

    @Test
    public void testListOfStrings() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/ListOfStrings.kt", ListOfStringsKt::main);
    }

    @Test
    public void testMutableVsReadonlyList() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/MutableVsReadonlyList.kt", MutableVsReadonlyListKt::main);
    }

    @Test
    public void testJetPack() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/JetPack.kt", JetPackKt::main);
    }

    @Test
    public void testASCIIMap() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/ASCIIMap.kt", ASCIIMapKt::main);
    }

    @Test
    public void testToDoubleException() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/ToDoubleException.kt", ToDoubleExceptionKt::main);
    }

    @Test
    public void testTicTacToe() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/TicTacToe.kt", TicTacToeKt::main);
    }

    @Test
    public void testListCollection() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/ListCollection.kt", ListCollectionKt::main);
    }

    @Test
    public void testExplicitTyping() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/ExplicitTyping.kt", ExplicitTypingKt::main);
    }

    @Test
    public void testQuadratic() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/Quadratic.kt", QuadraticKt::main);
    }

    @Test
    public void testGettersAndSetter() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/GettersAndSetter.kt", summary2.GettersAndSetterKt::main);
    }

    @Test
    public void testBoxes() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/Boxes.kt", BoxesKt::main);
    }

    @Test
    public void testWildAnimals() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/WildAnimals.kt", WildAnimalsKt::main);
    }

    @Test
    public void testArraySpread() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/ArraySpread.kt", ArraySpreadKt::main);
    }

    @Test
    public void testTemperature() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/Temperature.kt", TemperatureKt::main);
    }

    @Test
    public void testAtomicTestCapture() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/AtomicTestCapture.kt", AtomicTestCaptureKt::main);
    }

    @Test
    public void testMultipleListReferences() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/MultipleListReferences.kt", MultipleListReferencesKt::main);
    }

    @Test
    public void testUseALibrary() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/UseALibrary.kt", UseALibraryKt::main);
    }

    @Test
    public void testVarArgs() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/VarArgs.kt", VarArgsKt::main);
    }

    @Test
    public void testColorSet() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/ColorSet.kt", ColorSetKt::main);
    }

    @Test
    public void testPropertyReadWrite() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/PropertyReadWrite.kt", summary2.PropertyReadWriteKt::main);
    }

    @Test
    public void testForControl() {
        testExample("../AtomicKotlinCourse/Usability/break & continue/Examples/src/ForControl.kt", ForControlKt::main);
    }

    @Test
    public void testDoLabeled() {
        testExample("../AtomicKotlinCourse/Usability/break & continue/Examples/src/DoLabeled.kt", DoLabeledKt::main);
    }

    @Test
    public void testWhileControl() {
        testExample("../AtomicKotlinCourse/Usability/break & continue/Examples/src/WhileControl.kt", WhileControlKt::main);
    }

    @Test
    public void testDoControl() {
        testExample("../AtomicKotlinCourse/Usability/break & continue/Examples/src/DoControl.kt", DoControlKt::main);
    }

    @Test
    public void testWhileLabeled() {
        testExample("../AtomicKotlinCourse/Usability/break & continue/Examples/src/WhileLabeled.kt", WhileLabeledKt::main);
    }

    @Test
    public void testForLabeled() {
        testExample("../AtomicKotlinCourse/Usability/break & continue/Examples/src/ForLabeled.kt", ForLabeledKt::main);
    }

    @Test
    public void testQuoting() {
        testExample("../AtomicKotlinCourse/Usability/Extension Functions/Examples/src/Quoting.kt", quoting.QuotingKt::main);
    }

    @Test
    public void testBookExtensions() {
        testExample("../AtomicKotlinCourse/Usability/Extension Functions/Examples/src/BookExtensions.kt", BookExtensionsKt::main);
    }

    @Test
    public void testStrangeQuote() {
        testExample("../AtomicKotlinCourse/Usability/Extension Functions/Examples/src/StrangeQuote.kt", StrangeQuoteKt::main);
    }

    @Test
    public void testQuote() {
        testExample("../AtomicKotlinCourse/Usability/Extension Functions/Examples/src/Quote.kt", other.QuoteKt::main);
    }

    @Test
    public void testColor2() {
        testExample("../AtomicKotlinCourse/Usability/Named & Default Arguments/Examples/src/Color2.kt", color2.Color2Kt::main);
    }

    @Test
    public void testNamedArguments() {
        testExample("../AtomicKotlinCourse/Usability/Named & Default Arguments/Examples/src/NamedArguments.kt", color1.NamedArgumentsKt::main);
    }

    @Test
    public void testCreateString2() {
        testExample("../AtomicKotlinCourse/Usability/Named & Default Arguments/Examples/src/CreateString2.kt", CreateString2Kt::main);
    }

    @Test
    public void testColor3() {
        testExample("../AtomicKotlinCourse/Usability/Named & Default Arguments/Examples/src/Color3.kt", color3.Color3Kt::main);
    }

    @Test
    public void testArgumentOrder() {
        testExample("../AtomicKotlinCourse/Usability/Named & Default Arguments/Examples/src/ArgumentOrder.kt", color1.ArgumentOrderKt::main);
    }

    @Test
    public void testCreateString() {
        testExample("../AtomicKotlinCourse/Usability/Named & Default Arguments/Examples/src/CreateString.kt", CreateStringKt::main);
    }

    @Test
    public void testTrimMargin() {
        testExample("../AtomicKotlinCourse/Usability/Named & Default Arguments/Examples/src/TrimMargin.kt", TrimMarginKt::main);
    }

    @Test
    public void testEvaluation() {
        testExample("../AtomicKotlinCourse/Usability/Named & Default Arguments/Examples/src/Evaluation.kt", EvaluationKt::main);
    }

    @Test
    public void testOverloadingAdd() {
        testExample("../AtomicKotlinCourse/Usability/Overloading/Examples/src/OverloadingAdd.kt", OverloadingAddKt::main);
    }

    @Test
    public void testOverloading() {
        testExample("../AtomicKotlinCourse/Usability/Overloading/Examples/src/Overloading.kt", OverloadingKt::main);
    }

    @Test
    public void testWithDefaultArguments() {
        testExample("../AtomicKotlinCourse/Usability/Overloading/Examples/src/WithDefaultArguments.kt", withdefaultarguments.WithDefaultArgumentsKt::main);
    }

    @Test
    public void testMemberVsExtension() {
        testExample("../AtomicKotlinCourse/Usability/Overloading/Examples/src/MemberVsExtension.kt", MemberVsExtensionKt::main);
    }

    @Test
    public void testWithoutDefaultArguments() {
        testExample("../AtomicKotlinCourse/Usability/Overloading/Examples/src/WithoutDefaultArguments.kt", withoutdefaultarguments.WithoutDefaultArgumentsKt::main);
    }

    @Test
    public void testOverloadedVsDefaultArg() {
        testExample("../AtomicKotlinCourse/Usability/Overloading/Examples/src/OverloadedVsDefaultArg.kt", overloadingvsdefaultargs.OverloadedVsDefaultArgKt::main);
    }

    @Test
    public void testMixColors() {
        testExample("../AtomicKotlinCourse/Usability/when Expressions/Examples/src/MixColors.kt", MixColorsKt::main);
    }

    @Test
    public void testGermanOrdinals() {
        testExample("../AtomicKotlinCourse/Usability/when Expressions/Examples/src/GermanOrdinals.kt", GermanOrdinalsKt::main);
    }

    @Test
    public void testMatchingAgainstVals() {
        testExample("../AtomicKotlinCourse/Usability/when Expressions/Examples/src/MatchingAgainstVals.kt", MatchingAgainstValsKt::main);
    }

    @Test
    public void testAnalyzingInput() {
        testExample("../AtomicKotlinCourse/Usability/when Expressions/Examples/src/AnalyzingInput.kt", AnalyzingInputKt::main);
    }

    @Test
    public void testBmiWhen() {
        testExample("../AtomicKotlinCourse/Usability/when Expressions/Examples/src/BmiWhen.kt", BmiWhenKt::main);
    }

    @Test
    public void testLevel() {
        testExample("../AtomicKotlinCourse/Usability/Enumerations/Examples/src/Level.kt", enumerations.LevelKt::main);
    }

    @Test
    public void testEnumImport() {
        testExample("../AtomicKotlinCourse/Usability/Enumerations/Examples/src/EnumImport.kt", EnumImportKt::main);
    }

    @Test
    public void testRecursiveEnumImport() {
        testExample("../AtomicKotlinCourse/Usability/Enumerations/Examples/src/RecursiveEnumImport.kt", enumerations.RecursiveEnumImportKt::main);
    }

    @Test
    public void testDirection() {
        testExample("../AtomicKotlinCourse/Usability/Enumerations/Examples/src/Direction.kt", enumerations.DirectionKt::main);
    }

    @Test
    public void testCheckingOptions() {
        testExample("../AtomicKotlinCourse/Usability/Enumerations/Examples/src/CheckingOptions.kt", CheckingOptionsKt::main);
    }

    @Test
    public void testCopyDataClass() {
        testExample("../AtomicKotlinCourse/Usability/Data Classes/Examples/src/CopyDataClass.kt", CopyDataClassKt::main);
    }

    @Test
    public void testDataClasses() {
        testExample("../AtomicKotlinCourse/Usability/Data Classes/Examples/src/DataClasses.kt", dataclasses.DataClassesKt::main);
    }

    @Test
    public void testSimple() {
        testExample("../AtomicKotlinCourse/Usability/Data Classes/Examples/src/Simple.kt", SimpleKt::main);
    }

    @Test
    public void testExplicitCheck() {
        testExample("../AtomicKotlinCourse/Usability/Nullable Types/Examples/src/ExplicitCheck.kt", ExplicitCheckKt::main);
    }

    @Test
    public void testNullInMaps() {
        testExample("../AtomicKotlinCourse/Usability/Nullable Types/Examples/src/NullInMaps.kt", NullInMapsKt::main);
    }

    @Test
    public void testAmphibian() {
        testExample("../AtomicKotlinCourse/Usability/Nullable Types/Examples/src/Amphibian.kt", AmphibianKt::main);
    }

    @Test
    public void testNullableInMap() {
        testExample("../AtomicKotlinCourse/Usability/Nullable Types/Examples/src/NullableInMap.kt", NullableInMapKt::main);
    }

    @Test
    public void testDereference() {
        testExample("../AtomicKotlinCourse/Usability/Nullable Types/Examples/src/Dereference.kt", DereferenceKt::main);
    }

    @Test
    public void testNullableTypes() {
        testExample("../AtomicKotlinCourse/Usability/Nullable Types/Examples/src/NullableTypes.kt", NullableTypesKt::main);
    }

    @Test
    public void testElvisCall() {
        testExample("../AtomicKotlinCourse/Usability/Safe Calls & the Elvis Operator/Examples/src/ElvisCall.kt", elvisoperator.ElvisCallKt::main);
    }

    @Test
    public void testDereferenceNull() {
        testExample("../AtomicKotlinCourse/Usability/Safe Calls & the Elvis Operator/Examples/src/DereferenceNull.kt", DereferenceNullKt::main);
    }

    @Test
    public void testSafeOperation() {
        testExample("../AtomicKotlinCourse/Usability/Safe Calls & the Elvis Operator/Examples/src/SafeOperation.kt", SafeOperationKt::main);
    }

    @Test
    public void testChainedCalls() {
        testExample("../AtomicKotlinCourse/Usability/Safe Calls & the Elvis Operator/Examples/src/ChainedCalls.kt", safecalls.ChainedCallsKt::main);
    }

    @Test
    public void testElvisOperator() {
        testExample("../AtomicKotlinCourse/Usability/Safe Calls & the Elvis Operator/Examples/src/ElvisOperator.kt", ElvisOperatorKt::main);
    }

    @Test
    public void testSafeCall() {
        testExample("../AtomicKotlinCourse/Usability/Safe Calls & the Elvis Operator/Examples/src/SafeCall.kt", safecalls.SafeCallKt::main);
    }

    @Test
    public void testNonNullAssertCall() {
        testExample("../AtomicKotlinCourse/Usability/Non-null Assertions/Examples/src/NonNullAssertCall.kt", NonNullAssertCallKt::main);
    }

    @Test
    public void testNonNullAssert() {
        testExample("../AtomicKotlinCourse/Usability/Non-null Assertions/Examples/src/NonNullAssert.kt", NonNullAssertKt::main);
    }

    @Test
    public void testValueFromMap() {
        testExample("../AtomicKotlinCourse/Usability/Non-null Assertions/Examples/src/ValueFromMap.kt", ValueFromMapKt::main);
    }

    @Test
    public void testNullableParameter() {
        testExample("../AtomicKotlinCourse/Usability/Extensions for Nullable Types/Examples/src/NullableParameter.kt", NullableParameterKt::main);
    }

    @Test
    public void testDefinition() {
        testExample("../AtomicKotlinCourse/Usability/Extensions for Nullable Types/Examples/src/Definition.kt", DefinitionKt::main);
    }

    @Test
    public void testStringIsNullOr() {
        testExample("../AtomicKotlinCourse/Usability/Extensions for Nullable Types/Examples/src/StringIsNullOr.kt", StringIsNullOrKt::main);
    }

    @Test
    public void testAnyInstead() {
        testExample("../AtomicKotlinCourse/Usability/Introduction to Generics/Examples/src/AnyInstead.kt", introgenerics.AnyInsteadKt::main);
    }

    @Test
    public void testGenericListExtensions() {
        testExample("../AtomicKotlinCourse/Usability/Introduction to Generics/Examples/src/GenericListExtensions.kt", introgenerics.GenericListExtensionsKt::main);
    }

    @Test
    public void testGenericHolder() {
        testExample("../AtomicKotlinCourse/Usability/Introduction to Generics/Examples/src/GenericHolder.kt", introgenerics.GenericHolderKt::main);
    }

    @Test
    public void testGenericFunction() {
        testExample("../AtomicKotlinCourse/Usability/Introduction to Generics/Examples/src/GenericFunction.kt", introgenerics.GenericFunctionKt::main);
    }

    @Test
    public void testRigidHolder() {
        testExample("../AtomicKotlinCourse/Usability/Introduction to Generics/Examples/src/RigidHolder.kt", introgenerics.RigidHolderKt::main);
    }

    @Test
    public void testListOfStar() {
        testExample("../AtomicKotlinCourse/Usability/Extension Properties/Examples/src/ListOfStar.kt", extensionproperties.ListOfStarKt::main);
    }

    @Test
    public void testGenericListExt() {
        testExample("../AtomicKotlinCourse/Usability/Extension Properties/Examples/src/GenericListExt.kt", extensionproperties.GenericListExtKt::main);
    }

    @Test
    public void testAnyFromListOfStar() {
        testExample("../AtomicKotlinCourse/Usability/Extension Properties/Examples/src/AnyFromListOfStar.kt", extensionproperties.AnyFromListOfStarKt::main);
    }

    @Test
    public void testStringIndices() {
        testExample("../AtomicKotlinCourse/Usability/Extension Properties/Examples/src/StringIndices.kt", extensionproperties.StringIndicesKt::main);
    }

    @Test
    public void testZeroArguments() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambdas/Examples/src/ZeroArguments.kt", ZeroArgumentsKt::main);
    }

    @Test
    public void testOmittingParentheses() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambdas/Examples/src/OmittingParentheses.kt", OmittingParenthesesKt::main);
    }

    @Test
    public void testLambdaIt() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambdas/Examples/src/LambdaIt.kt", LambdaItKt::main);
    }

    @Test
    public void testTwoArgLambda() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambdas/Examples/src/TwoArgLambda.kt", TwoArgLambdaKt::main);
    }

    @Test
    public void testLambdaAndNamedArgs() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambdas/Examples/src/LambdaAndNamedArgs.kt", LambdaAndNamedArgsKt::main);
    }

    @Test
    public void testBasicLambda() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambdas/Examples/src/BasicLambda.kt", BasicLambdaKt::main);
    }

    @Test
    public void testMapping() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambdas/Examples/src/Mapping.kt", MappingKt::main);
    }

    @Test
    public void testListIndicesMap() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambdas/Examples/src/ListIndicesMap.kt", ListIndicesMapKt::main);
    }

    @Test
    public void testJoinToString() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambdas/Examples/src/JoinToString.kt", JoinToStringKt::main);
    }

    @Test
    public void testLambdaTypeInference() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambdas/Examples/src/LambdaTypeInference.kt", LambdaTypeInferenceKt::main);
    }

    @Test
    public void testUnderscore() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambdas/Examples/src/Underscore.kt", UnderscoreKt::main);
    }

    @Test
    public void testFilterEven() {
        testExample("../AtomicKotlinCourse/Functional Programming/The Importance of Lambdas/Examples/src/FilterEven.kt", FilterEvenKt::main);
    }

    @Test
    public void testFilter() {
        testExample("../AtomicKotlinCourse/Functional Programming/The Importance of Lambdas/Examples/src/Filter.kt", FilterKt::main);
    }

    @Test
    public void testGreaterThan2() {
        testExample("../AtomicKotlinCourse/Functional Programming/The Importance of Lambdas/Examples/src/GreaterThan2.kt", GreaterThan2Kt::main);
    }

    @Test
    public void testClosures3() {
        testExample("../AtomicKotlinCourse/Functional Programming/The Importance of Lambdas/Examples/src/Closures3.kt", Closures3Kt::main);
    }

    @Test
    public void testSum() {
        testExample("../AtomicKotlinCourse/Functional Programming/The Importance of Lambdas/Examples/src/Sum.kt", SumKt::main);
    }

    @Test
    public void testClosures2() {
        testExample("../AtomicKotlinCourse/Functional Programming/The Importance of Lambdas/Examples/src/Closures2.kt", Closures2Kt::main);
    }

    @Test
    public void testStoringLambda() {
        testExample("../AtomicKotlinCourse/Functional Programming/The Importance of Lambdas/Examples/src/StoringLambda.kt", StoringLambdaKt::main);
    }

    @Test
    public void testClosures() {
        testExample("../AtomicKotlinCourse/Functional Programming/The Importance of Lambdas/Examples/src/Closures.kt", ClosuresKt::main);
    }

    @Test
    public void testPairOfLists() {
        testExample("../AtomicKotlinCourse/Functional Programming/Operations on Collections/Examples/src/PairOfLists.kt", PairOfListsKt::main);
    }

    @Test
    public void testPartition() {
        testExample("../AtomicKotlinCourse/Functional Programming/Operations on Collections/Examples/src/Partition.kt", PartitionKt::main);
    }

    @Test
    public void testListInit() {
        testExample("../AtomicKotlinCourse/Functional Programming/Operations on Collections/Examples/src/ListInit.kt", ListInitKt::main);
    }

    @Test
    public void testByOperations() {
        testExample("../AtomicKotlinCourse/Functional Programming/Operations on Collections/Examples/src/ByOperations.kt", ByOperationsKt::main);
    }

    @Test
    public void testTakeOrDrop() {
        testExample("../AtomicKotlinCourse/Functional Programming/Operations on Collections/Examples/src/TakeOrDrop.kt", TakeOrDropKt::main);
    }

    @Test
    public void testFilterNotNull() {
        testExample("../AtomicKotlinCourse/Functional Programming/Operations on Collections/Examples/src/FilterNotNull.kt", FilterNotNullKt::main);
    }

    @Test
    public void testPredicates() {
        testExample("../AtomicKotlinCourse/Functional Programming/Operations on Collections/Examples/src/Predicates.kt", PredicatesKt::main);
    }

    @Test
    public void testOperationsOnSets() {
        testExample("../AtomicKotlinCourse/Functional Programming/Operations on Collections/Examples/src/OperationsOnSets.kt", OperationsOnSetsKt::main);
    }

    @Test
    public void testCreatingLists() {
        testExample("../AtomicKotlinCourse/Functional Programming/Operations on Collections/Examples/src/CreatingLists.kt", CreatingListsKt::main);
    }

    @Test
    public void testConstructorReference() {
        testExample("../AtomicKotlinCourse/Functional Programming/Member References/Examples/src/ConstructorReference.kt", memberreferences3.ConstructorReferenceKt::main);
    }

    @Test
    public void testTopLevelFunctionRef() {
        testExample("../AtomicKotlinCourse/Functional Programming/Member References/Examples/src/TopLevelFunctionRef.kt", memberreferences2.TopLevelFunctionRefKt::main);
    }

    @Test
    public void testSortWith() {
        testExample("../AtomicKotlinCourse/Functional Programming/Member References/Examples/src/SortWith.kt", memberreferences1.SortWithKt::main);
    }

    @Test
    public void testPropertyReference() {
        testExample("../AtomicKotlinCourse/Functional Programming/Member References/Examples/src/PropertyReference.kt", memberreferences1.PropertyReferenceKt::main);
    }

    @Test
    public void testFunctionReference() {
        testExample("../AtomicKotlinCourse/Functional Programming/Member References/Examples/src/FunctionReference.kt", memberreferences2.FunctionReferenceKt::main);
    }

    @Test
    public void testDefiningRepeat() {
        testExample("../AtomicKotlinCourse/Functional Programming/Function Types/Examples/src/DefiningRepeat.kt", definingrepeat.DefiningRepeatKt::main);
    }

    @Test
    public void testAnyFunImplementation() {
        testExample("../AtomicKotlinCourse/Functional Programming/Function Types/Examples/src/AnyFunImplementation.kt", AnyFunImplementationKt::main);
    }

    @Test
    public void testRepeatVerbose() {
        testExample("../AtomicKotlinCourse/Functional Programming/Function Types/Examples/src/RepeatVerbose.kt", RepeatVerboseKt::main);
    }

    @Test
    public void testNullableFunctionType() {
        testExample("../AtomicKotlinCourse/Functional Programming/Function Types/Examples/src/NullableFunctionType.kt", NullableFunctionTypeKt::main);
    }

    @Test
    public void testRepeatByInt() {
        testExample("../AtomicKotlinCourse/Functional Programming/Function Types/Examples/src/RepeatByInt.kt", RepeatByIntKt::main);
    }

    @Test
    public void testFunctionTypeExamples() {
        testExample("../AtomicKotlinCourse/Functional Programming/Function Types/Examples/src/FunctionTypeExamples.kt", FunctionTypeExamplesKt::main);
    }

    @Test
    public void testNullableReturnType() {
        testExample("../AtomicKotlinCourse/Functional Programming/Function Types/Examples/src/NullableReturnType.kt", NullableReturnTypeKt::main);
    }

    @Test
    public void testSimpleOperation() {
        testExample("../AtomicKotlinCourse/Functional Programming/Function Types/Examples/src/SimpleOperation.kt", SimpleOperationKt::main);
    }

    @Test
    public void testZipAndTransform() {
        testExample("../AtomicKotlinCourse/Functional Programming/Manipulating Lists/Examples/src/ZipAndTransform.kt", manipulatinglists.ZipAndTransformKt::main);
    }

    @Test
    public void testWhyFlatMap() {
        testExample("../AtomicKotlinCourse/Functional Programming/Manipulating Lists/Examples/src/WhyFlatMap.kt", manipulatinglists.WhyFlatMapKt::main);
    }

    @Test
    public void testZippingWithNext() {
        testExample("../AtomicKotlinCourse/Functional Programming/Manipulating Lists/Examples/src/ZippingWithNext.kt", ZippingWithNextKt::main);
    }

    @Test
    public void testFlatten() {
        testExample("../AtomicKotlinCourse/Functional Programming/Manipulating Lists/Examples/src/Flatten.kt", FlattenKt::main);
    }

    @Test
    public void testFlattenAndFlatMap() {
        testExample("../AtomicKotlinCourse/Functional Programming/Manipulating Lists/Examples/src/FlattenAndFlatMap.kt", FlattenAndFlatMapKt::main);
    }

    @Test
    public void testZipper() {
        testExample("../AtomicKotlinCourse/Functional Programming/Manipulating Lists/Examples/src/Zipper.kt", ZipperKt::main);
    }

    @Test
    public void testGetOrPut() {
        testExample("../AtomicKotlinCourse/Functional Programming/From Lists to Maps/Examples/src/GetOrPut.kt", GetOrPutKt::main);
    }

    @Test
    public void testGroupBy() {
        testExample("../AtomicKotlinCourse/Functional Programming/From Lists to Maps/Examples/src/GroupBy.kt", GroupByKt::main);
    }

    @Test
    public void testTransformingMap() {
        testExample("../AtomicKotlinCourse/Functional Programming/From Lists to Maps/Examples/src/TransformingMap.kt", TransformingMapKt::main);
    }

    @Test
    public void testAssociateBy() {
        testExample("../AtomicKotlinCourse/Functional Programming/From Lists to Maps/Examples/src/AssociateBy.kt", AssociateByKt::main);
    }

    @Test
    public void testFilteringMap() {
        testExample("../AtomicKotlinCourse/Functional Programming/From Lists to Maps/Examples/src/FilteringMap.kt", FilteringMapKt::main);
    }

    @Test
    public void testSimilarOperation() {
        testExample("../AtomicKotlinCourse/Functional Programming/From Lists to Maps/Examples/src/SimilarOperation.kt", SimilarOperationKt::main);
    }

    @Test
    public void testGroupByVsFilter() {
        testExample("../AtomicKotlinCourse/Functional Programming/From Lists to Maps/Examples/src/GroupByVsFilter.kt", GroupByVsFilterKt::main);
    }

    @Test
    public void testRegularLambda() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambda with Receiver/Examples/src/RegularLambda.kt", regularlambda.RegularLambdaKt::main);
    }

    @Test
    public void testBuildStringAndThis() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambda with Receiver/Examples/src/BuildStringAndThis.kt", BuildStringAndThisKt::main);
    }

    @Test
    public void testBuildString() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambda with Receiver/Examples/src/BuildString.kt", BuildStringKt::main);
    }

    @Test
    public void testDeclarations() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambda with Receiver/Examples/src/Declarations.kt", lambdawithreceiver.DeclarationsKt::main);
    }

    @Test
    public void testStringBuilder() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambda with Receiver/Examples/src/StringBuilder.kt", StringBuilderKt::main);
    }

    @Test
    public void testRepetitive() {
        testExample("../AtomicKotlinCourse/Functional Programming/The with() Function/Examples/src/Repetitive.kt", withfunction.RepetitiveKt::main);
    }

    @Test
    public void testUsingWith() {
        testExample("../AtomicKotlinCourse/Functional Programming/The with() Function/Examples/src/UsingWith.kt", withfunction.UsingWithKt::main);
    }

    @Test
    public void testResultOfApply() {
        testExample("../AtomicKotlinCourse/Functional Programming/Library Helpers/Examples/src/ResultOfApply.kt", libraryhelpers.ResultOfApplyKt::main);
    }

    @Test
    public void testApplyVsAlso() {
        testExample("../AtomicKotlinCourse/Functional Programming/Library Helpers/Examples/src/ApplyVsAlso.kt", libraryhelpers.ApplyVsAlsoKt::main);
    }

    @Test
    public void testLet() {
        testExample("../AtomicKotlinCourse/Functional Programming/Library Helpers/Examples/src/Let.kt", libraryhelpers.LetKt::main);
    }

    @Test
    public void testAlso() {
        testExample("../AtomicKotlinCourse/Functional Programming/Library Helpers/Examples/src/Also.kt", libraryhelpers.AlsoKt::main);
    }

    @Test
    public void testCheckingArgument() {
        testExample("../AtomicKotlinCourse/Functional Programming/Library Helpers/Examples/src/CheckingArgument.kt", libraryhelpers.CheckingArgumentKt::main);
    }

    @Test
    public void testNullableReceiver() {
        testExample("../AtomicKotlinCourse/Functional Programming/Library Helpers/Examples/src/NullableReceiver.kt", libraryhelpers.NullableReceiverKt::main);
    }

    @Test
    public void testResultOfWith() {
        testExample("../AtomicKotlinCourse/Functional Programming/Library Helpers/Examples/src/ResultOfWith.kt", libraryhelpers.ResultOfWithKt::main);
    }

    @Test
    public void testApplyIfNotNull() {
        testExample("../AtomicKotlinCourse/Functional Programming/Library Helpers/Examples/src/ApplyIfNotNull.kt", libraryhelpers.ApplyIfNotNullKt::main);
    }

    @Test
    public void testEagerVsLazyEvaluation() {
        testExample("../AtomicKotlinCourse/Functional Programming/Sequences/Examples/src/EagerVsLazyEvaluation.kt", sequences.EagerVsLazyEvaluationKt::main);
    }

    @Test
    public void testNoComputationYet() {
        testExample("../AtomicKotlinCourse/Functional Programming/Sequences/Examples/src/NoComputationYet.kt", sequences.NoComputationYetKt::main);
    }

    @Test
    public void testTerminalOperations() {
        testExample("../AtomicKotlinCourse/Functional Programming/Sequences/Examples/src/TerminalOperations.kt", sequences.TerminalOperationsKt::main);
    }

    @Test
    public void testEagerEvaluation() {
        testExample("../AtomicKotlinCourse/Functional Programming/Sequences/Examples/src/EagerEvaluation.kt", EagerEvaluationKt::main);
    }

    @Test
    public void testInputLines1() {
        testExample("../AtomicKotlinCourse/Functional Programming/More Library Functions/Examples/src/InputLines1.kt", InputLines1Kt::main);
    }

    @Test
    public void testDefineTakeIf() {
        testExample("../AtomicKotlinCourse/Functional Programming/More Library Functions/Examples/src/DefineTakeIf.kt", definetakeif.DefineTakeIfKt::main);
    }

    @Test
    public void testNumberSequence2() {
        testExample("../AtomicKotlinCourse/Functional Programming/More Library Functions/Examples/src/NumberSequence2.kt", NumberSequence2Kt::main);
    }

    @Test
    public void testReadingName() {
        testExample("../AtomicKotlinCourse/Functional Programming/More Library Functions/Examples/src/ReadingName.kt", ReadingNameKt::main);
    }

    @Test
    public void testNumberSequence1() {
        testExample("../AtomicKotlinCourse/Functional Programming/More Library Functions/Examples/src/NumberSequence1.kt", NumberSequence1Kt::main);
    }

    @Test
    public void testReadingNameWithIf() {
        testExample("../AtomicKotlinCourse/Functional Programming/More Library Functions/Examples/src/ReadingNameWithIf.kt", ReadingNameWithIfKt::main);
    }

    @Test
    public void testInputLines2() {
        testExample("../AtomicKotlinCourse/Functional Programming/More Library Functions/Examples/src/InputLines2.kt", InputLines2Kt::main);
    }

    @Test
    public void testInterestingSessions() {
        testExample("../AtomicKotlinCourse/Functional Programming/Functions Inside Functions/Examples/src/InterestingSessions.kt", localfunctions.InterestingSessionsKt::main);
    }

    @Test
    public void testReturnFromFun() {
        testExample("../AtomicKotlinCourse/Functional Programming/Functions Inside Functions/Examples/src/ReturnFromFun.kt", ReturnFromFunKt::main);
    }

    @Test
    public void testReturnInsideLambda() {
        testExample("../AtomicKotlinCourse/Functional Programming/Functions Inside Functions/Examples/src/ReturnInsideLambda.kt", localfunctions.ReturnInsideLambdaKt::main);
    }

    @Test
    public void testLocalFunctions() {
        testExample("../AtomicKotlinCourse/Functional Programming/Functions Inside Functions/Examples/src/LocalFunctions.kt", LocalFunctionsKt::main);
    }

    @Test
    public void testLabeledReturn() {
        testExample("../AtomicKotlinCourse/Functional Programming/Functions Inside Functions/Examples/src/LabeledReturn.kt", LabeledReturnKt::main);
    }

    @Test
    public void testLocalExtensions() {
        testExample("../AtomicKotlinCourse/Functional Programming/Functions Inside Functions/Examples/src/LocalExtensions.kt", LocalExtensionsKt::main);
    }

    @Test
    public void testLocalFunctionReference() {
        testExample("../AtomicKotlinCourse/Functional Programming/Functions Inside Functions/Examples/src/LocalFunctionReference.kt", localfunctions.LocalFunctionReferenceKt::main);
    }

    @Test
    public void testCustomLabel() {
        testExample("../AtomicKotlinCourse/Functional Programming/Functions Inside Functions/Examples/src/CustomLabel.kt", CustomLabelKt::main);
    }

    @Test
    public void testHelperFunction() {
        testExample("../AtomicKotlinCourse/Functional Programming/Functions Inside Functions/Examples/src/HelperFunction.kt", localfunctions.HelperFunctionKt::main);
    }

    @Test
    public void testFoldRight() {
        testExample("../AtomicKotlinCourse/Functional Programming/Folding Lists/Examples/src/FoldRight.kt", FoldRightKt::main);
    }

    @Test
    public void testSumViaFold() {
        testExample("../AtomicKotlinCourse/Functional Programming/Folding Lists/Examples/src/SumViaFold.kt", SumViaFoldKt::main);
    }

    @Test
    public void testFoldAndReduce() {
        testExample("../AtomicKotlinCourse/Functional Programming/Folding Lists/Examples/src/FoldAndReduce.kt", FoldAndReduceKt::main);
    }

    @Test
    public void testFoldVsForLoop() {
        testExample("../AtomicKotlinCourse/Functional Programming/Folding Lists/Examples/src/FoldVsForLoop.kt", FoldVsForLoopKt::main);
    }

    @Test
    public void testCallStack() {
        testExample("../AtomicKotlinCourse/Functional Programming/Recursion/Examples/src/CallStack.kt", recursion.CallStackKt::main);
    }

    @Test
    public void testFactorial() {
        testExample("../AtomicKotlinCourse/Functional Programming/Recursion/Examples/src/Factorial.kt", recursion.FactorialKt::main);
    }

    @Test
    public void testFibonacci() {
        testExample("../AtomicKotlinCourse/Functional Programming/Recursion/Examples/src/Fibonacci.kt", recursion.FibonacciKt::main);
    }

    @Test
    public void testRecursionLimits() {
        testExample("../AtomicKotlinCourse/Functional Programming/Recursion/Examples/src/RecursionLimits.kt", recursion.RecursionLimitsKt::main);
    }

    @Test
    public void testTailRecursiveSum() {
        testExample("../AtomicKotlinCourse/Functional Programming/Recursion/Examples/src/TailRecursiveSum.kt", tailrecursion.TailRecursiveSumKt::main);
    }

    @Test
    public void testIteration() {
        testExample("../AtomicKotlinCourse/Functional Programming/Recursion/Examples/src/Iteration.kt", iteration.IterationKt::main);
    }

    @Test
    public void testInfiniteRecursion() {
        testExample("../AtomicKotlinCourse/Functional Programming/Recursion/Examples/src/InfiniteRecursion.kt", recursion.InfiniteRecursionKt::main);
    }

    @Test
    public void testVerySlowFibonacci() {
        testExample("../AtomicKotlinCourse/Functional Programming/Recursion/Examples/src/VerySlowFibonacci.kt", slowfibonacci.VerySlowFibonacciKt::main);
    }

    @Test
    public void testSuperComputer() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Interfaces/Examples/src/SuperComputer.kt", interfaces.SuperComputerKt::main);
    }

    @Test
    public void testAnotherComputer() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Interfaces/Examples/src/AnotherComputer.kt", interfaces.AnotherComputerKt::main);
    }

    @Test
    public void testInitSection() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Complex Constructors/Examples/src/InitSection.kt", complexconstructors.InitSectionKt::main);
    }

    @Test
    public void testSimpleConstructor() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Complex Constructors/Examples/src/SimpleConstructor.kt", complexconstructors.SimpleConstructorKt::main);
    }

    @Test
    public void testGameMatrix() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Complex Constructors/Examples/src/GameMatrix.kt", complexconstructors.GameMatrixKt::main);
    }

    @Test
    public void testWithSecondary() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Secondary Constructors/Examples/src/WithSecondary.kt", secondaryconstructors.WithSecondaryKt::main);
    }

    @Test
    public void testGardenItem() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Secondary Constructors/Examples/src/GardenItem.kt", secondaryconstructors.GardenItemKt::main);
    }

    @Test
    public void testGreatApe() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Inheritance/Examples/src/GreatApe.kt", inheritance.GreatApeKt::main);
    }

    @Test
    public void testGreatApe2() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Inheritance/Examples/src/GreatApe2.kt", GreatApe2Kt::main);
    }

    @Test
    public void testGreatApe3() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Base Class Initialization/Examples/src/GreatApe3.kt", baseclassinit.GreatApe3Kt::main);
    }

    @Test
    public void testOtherConstructors() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Base Class Initialization/Examples/src/OtherConstructors.kt", baseclassinit.OtherConstructorsKt::main);
    }

    @Test
    public void testHouse() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Base Class Initialization/Examples/src/House.kt", baseclassinit.HouseKt::main);
    }

    @Test
    public void testGadget() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Abstract Classes/Examples/src/Gadget.kt", GadgetKt::main);
    }

    @Test
    public void testInterfaceCollision() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Abstract Classes/Examples/src/InterfaceCollision.kt", collision.InterfaceCollisionKt::main);
    }

    @Test
    public void testStateOfAClass() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Abstract Classes/Examples/src/StateOfAClass.kt", abstractstate.StateOfAClassKt::main);
    }

    @Test
    public void testPet() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Dynamic Binding/Examples/src/Pet.kt", dynamicbinding.PetKt::main);
    }

    @Test
    public void testDessert() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Polymorphism/Examples/src/Dessert.kt", polymorphism.DessertKt::main);
    }

    @Test
    public void testDowncasting() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Polymorphism/Examples/src/Downcasting.kt", polymorphism.DowncastingKt::main);
    }

    @Test
    public void testDessert2() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Polymorphism/Examples/src/Dessert2.kt", polymorphism.Dessert2Kt::main);
    }

    @Test
    public void testUnsafe() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Casting/Examples/src/Unsafe.kt", casting.UnsafeKt::main);
    }

    @Test
    public void testSmartCast() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Casting/Examples/src/SmartCast.kt", casting.SmartCastKt::main);
    }

    @Test
    public void testSafe() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Casting/Examples/src/Safe.kt", casting.SafeKt::main);
    }

    @Test
    public void testWhenAndCasting() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Casting/Examples/src/WhenAndCasting.kt", casting.WhenAndCastingKt::main);
    }

    @Test
    public void testHumanAlice() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Casting/Examples/src/HumanAlice.kt", casting.HumanAliceKt::main);
    }

    @Test
    public void testRegularClasses() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Sealed Classes/Examples/src/RegularClasses.kt", RegularClassesKt::main);
    }

    @Test
    public void testSealedClasses() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Sealed Classes/Examples/src/SealedClasses.kt", sealedclasses.SealedClassesKt::main);
    }

    @Test
    public void testObjectNesting() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Objects/Examples/src/ObjectNesting.kt", ObjectNestingKt::main);
    }

    @Test
    public void testObjectKeyword() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Objects/Examples/src/ObjectKeyword.kt", ObjectKeywordKt::main);
    }

    @Test
    public void testObjectInheritance() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Objects/Examples/src/ObjectInheritance.kt", ObjectInheritanceKt::main);
    }

    @Test
    public void testObjectProperty() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Companion Objects/Examples/src/ObjectProperty.kt", ObjectPropertyKt::main);
    }

    @Test
    public void testCompanionObject() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Companion Objects/Examples/src/CompanionObject.kt", CompanionObjectKt::main);
    }

    @Test
    public void testObjectFunctions() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Companion Objects/Examples/src/ObjectFunctions.kt", ObjectFunctionsKt::main);
    }

    @Test
    public void testObjectCounter() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Companion Objects/Examples/src/ObjectCounter.kt", ObjectCounterKt::main);
    }

    @Test
    public void testCompanionFactory() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Companion Objects/Examples/src/CompanionFactory.kt", companionobjects.CompanionFactoryKt::main);
    }

    @Test
    public void testNamedCompanionObject() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Companion Objects/Examples/src/NamedCompanionObject.kt", NamedCompanionObjectKt::main);
    }

    @Test
    public void testModelingMI() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Class Delegation/Examples/src/ModelingMI.kt", ModelingMIKt::main);
    }

    @Test
    public void testExplicitDelegation() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Class Delegation/Examples/src/ExplicitDelegation.kt", ExplicitDelegationKt::main);
    }

    @Test
    public void testDelegatedControls() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Class Delegation/Examples/src/DelegatedControls.kt", DelegatedControlsKt::main);
    }

    @Test
    public void testLabeledThis() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Inner & Nested Classes/Examples/src/LabeledThis.kt", labeledthis.LabeledThisKt::main);
    }

    @Test
    public void testTryFinally() {
        testExample("../AtomicKotlinCourse/Preventing Failure/Exception Handling/Examples/src/TryFinally.kt", exceptionhandling.TryFinallyKt::main);
    }

    @Test
    public void testNewException() {
        testExample("../AtomicKotlinCourse/Preventing Failure/Exception Handling/Examples/src/NewException.kt", exceptionhandling.NewExceptionKt::main);
    }

    @Test
    public void testGuaranteedCleanup() {
        testExample("../AtomicKotlinCourse/Preventing Failure/Exception Handling/Examples/src/GuaranteedCleanup.kt", GuaranteedCleanupKt::main);
    }

    @Test
    public void testDefiningExceptions() {
        testExample("../AtomicKotlinCourse/Preventing Failure/Exception Handling/Examples/src/DefiningExceptions.kt", exceptionhandling.DefiningExceptionsKt::main);
    }

    @Test
    public void testLibraryException() {
        testExample("../AtomicKotlinCourse/Preventing Failure/Exception Handling/Examples/src/LibraryException.kt", exceptionhandling.LibraryExceptionKt::main);
    }

    @Test
    public void testHandlers() {
        testExample("../AtomicKotlinCourse/Preventing Failure/Exception Handling/Examples/src/Handlers.kt", exceptionhandling.HandlersKt::main);
    }

    @Test
    public void testHierarchy() {
        testExample("../AtomicKotlinCourse/Preventing Failure/Exception Handling/Examples/src/Hierarchy.kt", exceptionhandling.HierarchyKt::main);
    }

    @Test
    public void testRequireNotNull() {
        //testExample("../AtomicKotlinCourse/Preventing Failure/Check Instructions/Examples/src/RequireNotNull.kt", checkinstructions.RequireNotNullKt::main);
    }

    @Test
    public void testPostconditions() {
        //testExample("../AtomicKotlinCourse/Preventing Failure/Check Instructions/Examples/src/Postconditions.kt", checkinstructions.PostconditionsKt::main);
    }

    @Test
    public void testSingleArgRequire() {
        //testExample("../AtomicKotlinCourse/Preventing Failure/Check Instructions/Examples/src/SingleArgRequire.kt", checkinstructions.SingleArgRequireKt::main);
    }

    @Test
    public void testGetTrace() {
        //testExample("../AtomicKotlinCourse/Preventing Failure/Check Instructions/Examples/src/GetTrace.kt", checkinstructions.GetTraceKt::main);
    }

    @Test
    public void testLocalFile() {
        //testExample("../AtomicKotlinCourse/Preventing Failure/Check Instructions/Examples/src/LocalFile.kt", checkinstructions.LocalFileKt::main);
    }

    @Test
    public void testFail() {
        testExample("../AtomicKotlinCourse/Preventing Failure/The Nothing Type/Examples/src/Fail.kt", nothingtype.FailKt::main);
    }

    @Test
    public void testTodo() {
        testExample("../AtomicKotlinCourse/Preventing Failure/The Nothing Type/Examples/src/Todo.kt", nothingtype.TodoKt::main);
    }

    @Test
    public void testCheckObject2() {
        testExample("../AtomicKotlinCourse/Preventing Failure/The Nothing Type/Examples/src/CheckObject2.kt", nothingtype.CheckObject2Kt::main);
    }

    @Test
    public void testCheckObject() {
        testExample("../AtomicKotlinCourse/Preventing Failure/The Nothing Type/Examples/src/CheckObject.kt", nothingtype.CheckObjectKt::main);
    }

    @Test
    public void testCloseable() {
        //testExample("../AtomicKotlinCourse/Preventing Failure/Resource Cleanup/Examples/src/Closeable.kt", resourcecleanup.CloseableKt::main);
    }

    @Test
    public void testUseLines() {
        //testExample("../AtomicKotlinCourse/Preventing Failure/Resource Cleanup/Examples/src/UseLines.kt", resourcecleanup.UseLinesKt::main);
    }

    @Test
    public void testUsable() {
        //testExample("../AtomicKotlinCourse/Preventing Failure/Resource Cleanup/Examples/src/Usable.kt", resourcecleanup.UsableKt::main);
    }

    @Test
    public void testForEachLine() {
        //testExample("../AtomicKotlinCourse/Preventing Failure/Resource Cleanup/Examples/src/ForEachLine.kt", resourcecleanup.ForEachLineKt::main);
    }

    @Test
    public void testUseAtomicLog() {
        //testExample("../AtomicKotlinCourse/Preventing Failure/Logging/Examples/src/UseAtomicLog.kt", UseAtomicLogKt::main);
    }

    @Test
    public void testBasicLogging() {
        //testExample("../AtomicKotlinCourse/Preventing Failure/Logging/Examples/src/BasicLogging.kt", logging.BasicLoggingKt::main);
    }

    @Test
    public void testSimpleLoggingStrategy() {
        //testExample("../AtomicKotlinCourse/Preventing Failure/Logging/Examples/src/SimpleLoggingStrategy.kt", logging.SimpleLoggingStrategyKt::main);
    }

    @Test
    public void testTeaPartyTexting() {
        testExample("../AtomicKotlinCourse/Concurrency/async and await/Examples/src/TeaPartyTexting.kt", asyncandawait.TeaPartyTextingKt::main);
    }

    @Test
    public void testLazySequence() {
        //testExample("../AtomicKotlinCourse/Concurrency/Coroutines/Examples/src/LazySequence.kt", LazySequenceKt::main);
    }

    @Test
    public void testCompareDelayingTask() {
        //testExample("../AtomicKotlinCourse/Concurrency/Coroutines/Examples/src/CompareDelayingTask.kt", CompareDelayingTaskKt::main);
    }

    @Test
    public void testHelloCoroutines() {
        //testExample("../AtomicKotlinCourse/Concurrency/Coroutines/Examples/src/HelloCoroutines.kt", HelloCoroutinesKt::main);
    }

    @Test
    public void testCompareSlowFib() {
        //testExample("../AtomicKotlinCourse/Concurrency/Coroutines/Examples/src/CompareSlowFib.kt", CompareSlowFibKt::main);
    }

    @Test
    public void testLaunchMany() {
        //testExample("../AtomicKotlinCourse/Concurrency/Coroutines/Examples/src/LaunchMany.kt", LaunchManyKt::main);
    }

    @Test
    public void testLaunchManyTimed() {
        //testExample("../AtomicKotlinCourse/Concurrency/Coroutines/Examples/src/LaunchManyTimed.kt", LaunchManyTimedKt::main);
    }

    @Test
    public void testFibonacciSequence() {
        //testExample("../AtomicKotlinCourse/Concurrency/Coroutines/Examples/src/FibonacciSequence.kt", FibonacciSequenceKt::main);
    }

    @Test
    public void testColorBlend() {
        testExample("../AtomicKotlinCourse/Power Tools/Immutability/Examples/src/ColorBlend.kt", colorblend.ColorBlendKt::main);
    }

    @Test
    public void testImmutableBlendMap2() {
        testExample("../AtomicKotlinCourse/Power Tools/Immutability/Examples/src/ImmutableBlendMap2.kt", immutableblendmap2.ImmutableBlendMap2Kt::main);
    }

    @Test
    public void testXYZMap() {
        testExample("../AtomicKotlinCourse/Power Tools/Immutability/Examples/src/XYZMap.kt", xyzmap.XYZMapKt::main);
    }

    @Test
    public void testMutableBlendMap2() {
        testExample("../AtomicKotlinCourse/Power Tools/Immutability/Examples/src/MutableBlendMap2.kt", mutableblendmap2.MutableBlendMap2Kt::main);
    }

    @Test
    public void testImmutableBlendMap3() {
        testExample("../AtomicKotlinCourse/Power Tools/Immutability/Examples/src/ImmutableBlendMap3.kt", immutableblendmap3.ImmutableBlendMap3Kt::main);
    }

    @Test
    public void testMutableBlendMap() {
        testExample("../AtomicKotlinCourse/Power Tools/Immutability/Examples/src/MutableBlendMap.kt", mutableblendmap.MutableBlendMapKt::main);
    }

    @Test
    public void testImmutableBlendMap() {
        testExample("../AtomicKotlinCourse/Power Tools/Immutability/Examples/src/ImmutableBlendMap.kt", immutableblendmap.ImmutableBlendMapKt::main);
    }

    @Test
    public void testDataClassCopy() {
        testExample("../AtomicKotlinCourse/Power Tools/Immutability/Examples/src/DataClassCopy.kt", DataClassCopyKt::main);
    }

    @Test
    public void testXYZFlatMap() {
        testExample("../AtomicKotlinCourse/Power Tools/Immutability/Examples/src/XYZFlatMap.kt", xyzflatmap.XYZFlatMapKt::main);
    }

    @Test
    public void testKeyFailure() {
        testExample("../AtomicKotlinCourse/Power Tools/Hashing/Examples/src/KeyFailure.kt", KeyFailureKt::main);
    }

    @Test
    public void testSimpleHashing() {
        testExample("../AtomicKotlinCourse/Power Tools/Hashing/Examples/src/SimpleHashing.kt", SimpleHashingKt::main);
    }

    @Test
    public void testHashCodeFailure() {
        testExample("../AtomicKotlinCourse/Power Tools/Hashing/Examples/src/HashCodeFailure.kt", HashCodeFailureKt::main);
    }

    @Test
    public void testPets() {
        testExample("../AtomicKotlinCourse/Power Tools/Hashing/Examples/src/Pets.kt", hashing.PetsKt::main);
    }

    @Test
    public void testEasyKeys() {
        testExample("../AtomicKotlinCourse/Power Tools/Hashing/Examples/src/EasyKeys.kt", hashing.EasyKeysKt::main);
    }

    @Test
    public void testStringHashCode() {
        testExample("../AtomicKotlinCourse/Power Tools/Hashing/Examples/src/StringHashCode.kt", StringHashCodeKt::main);
    }

    @Test
    public void testUnpredictableHashing() {
        testExample("../AtomicKotlinCourse/Power Tools/Hashing/Examples/src/UnpredictableHashing.kt", UnpredictableHashingKt::main);
    }

    @Test
    public void testComputation() {
        testExample("../AtomicKotlinCourse/Power Tools/Destructuring Declarations/Examples/src/Computation.kt", destructuring.ComputationKt::main);
    }

    @Test
    public void testPairDestructuring() {
        testExample("../AtomicKotlinCourse/Power Tools/Destructuring Declarations/Examples/src/PairDestructuring.kt", destructuring.PairDestructuringKt::main);
    }

    @Test
    public void testForLoop() {
        testExample("../AtomicKotlinCourse/Power Tools/Destructuring Declarations/Examples/src/ForLoop.kt", ForLoopKt::main);
    }

    @Test
    public void testTuple() {
        testExample("../AtomicKotlinCourse/Power Tools/Destructuring Declarations/Examples/src/Tuple.kt", destructuring.TupleKt::main);
    }

    @Test
    public void testPairs() {
        testExample("../AtomicKotlinCourse/Power Tools/Destructuring Declarations/Examples/src/Pairs.kt", destructuring.PairsKt::main);
    }

    @Test
    public void testMemberOperator() {
        testExample("../AtomicKotlinCourse/Power Tools/Operator Overloading/Examples/src/MemberOperator.kt", operatoroverloading.MemberOperatorKt::main);
    }

    @Test
    public void testBackticks() {
        testExample("../AtomicKotlinCourse/Power Tools/Operator Overloading/Examples/src/Backticks.kt", BackticksKt::main);
    }

    @Test
    public void testStringInvoke() {
        testExample("../AtomicKotlinCourse/Power Tools/Operator Overloading/Examples/src/StringInvoke.kt", StringInvokeKt::main);
    }

    @Test
    public void testSwearing() {
        testExample("../AtomicKotlinCourse/Power Tools/Operator Overloading/Examples/src/Swearing.kt", SwearingKt::main);
    }

    @Test
    public void testAllOperators() {
        testExample("../AtomicKotlinCourse/Power Tools/Operator Overloading/Examples/src/AllOperators.kt", operatoroverloading.AllOperatorsKt::main);
    }

    @Test
    public void testInvoke() {
        testExample("../AtomicKotlinCourse/Power Tools/Operator Overloading/Examples/src/Invoke.kt", InvokeKt::main);
    }

    @Test
    public void testMolecule() {
        testExample("../AtomicKotlinCourse/Power Tools/Operator Overloading/Examples/src/Molecule.kt", MoleculeKt::main);
    }

    @Test
    public void testNum() {
        testExample("../AtomicKotlinCourse/Power Tools/Operator Overloading/Examples/src/Num.kt", operatoroverloading.NumKt::main);
    }

    @Test
    public void testCompareTo() {
        testExample("../AtomicKotlinCourse/Power Tools/Using Operators/Examples/src/CompareTo.kt", usingoperators.CompareToKt::main);
    }

    @Test
    public void testOperatorPlus() {
        testExample("../AtomicKotlinCourse/Power Tools/Using Operators/Examples/src/OperatorPlus.kt", OperatorPlusKt::main);
    }

    @Test
    public void testNewAngle() {
        testExample("../AtomicKotlinCourse/Power Tools/Using Operators/Examples/src/NewAngle.kt", NewAngleKt::main);
    }

    @Test
    public void testUnexpected() {
        testExample("../AtomicKotlinCourse/Power Tools/Using Operators/Examples/src/Unexpected.kt", UnexpectedKt::main);
    }

    @Test
    public void testDestructuringMap() {
        testExample("../AtomicKotlinCourse/Power Tools/Using Operators/Examples/src/DestructuringMap.kt", usingoperators.DestructuringMapKt::main);
    }

    @Test
    public void testDestructuringData() {
        testExample("../AtomicKotlinCourse/Power Tools/Using Operators/Examples/src/DestructuringData.kt", usingoperators.DestructuringDataKt::main);
    }

    @Test
    public void testImmutableAndPlus() {
        testExample("../AtomicKotlinCourse/Power Tools/Using Operators/Examples/src/ImmutableAndPlus.kt", ImmutableAndPlusKt::main);
    }

    @Test
    public void testDestructuringDuo() {
        testExample("../AtomicKotlinCourse/Power Tools/Using Operators/Examples/src/DestructuringDuo.kt", DestructuringDuoKt::main);
    }

    @Test
    public void testPropertyOptions() {
        testExample("../AtomicKotlinCourse/Power Tools/Lazy Initialization/Examples/src/PropertyOptions.kt", lazyinitialization.PropertyOptionsKt::main);
    }

    @Test
    public void testLazySyntax() {
        testExample("../AtomicKotlinCourse/Power Tools/Lazy Initialization/Examples/src/LazySyntax.kt", lazyinitialization.LazySyntaxKt::main);
    }

    @Test
    public void testLazyInt() {
        testExample("../AtomicKotlinCourse/Power Tools/Lazy Initialization/Examples/src/LazyInt.kt", LazyIntKt::main);
    }

    @Test
    public void testFaultySuitcase() {
        testExample("../AtomicKotlinCourse/Power Tools/Late Initialization/Examples/src/FaultySuitcase.kt", lateinitialization.FaultySuitcaseKt::main);
    }

    @Test
    public void testBetterSuitcase() {
        testExample("../AtomicKotlinCourse/Power Tools/Late Initialization/Examples/src/BetterSuitcase.kt", lateinitialization.BetterSuitcaseKt::main);
    }

    @Test
    public void testSuitcase() {
        testExample("../AtomicKotlinCourse/Power Tools/Late Initialization/Examples/src/Suitcase.kt", lateinitialization.SuitcaseKt::main);
    }

    @Test
    public void testNickName() {
        testExample("../AtomicKotlinCourse/Power Tools/Property Delegation/Examples/src/NickName.kt", propertydelegation.NickNameKt::main);
    }

    @Test
    public void testFibonacciProperty() {
        testExample("../AtomicKotlinCourse/Power Tools/Property Delegation/Examples/src/FibonacciProperty.kt", FibonacciPropertyKt::main);
    }

    @Test
    public void testTeamWithTraditions() {
        testExample("../AtomicKotlinCourse/Power Tools/Property Delegation Tools/Examples/src/TeamWithTraditions.kt", TeamWithTraditionsKt::main);
    }

    @Test
    public void testTeam() {
        testExample("../AtomicKotlinCourse/Power Tools/Property Delegation Tools/Examples/src/Team.kt", TeamKt::main);
    }

    @Test
    public void testSpeakers() {
        testExample("../AtomicKotlinCourse/Advanced Topics/More about Generics/Examples/src/Speakers.kt", generics.SpeakersKt::main);
    }

    @Test
    public void testBasicGenerics() {
        testExample("../AtomicKotlinCourse/Advanced Topics/More about Generics/Examples/src/BasicGenerics.kt", generics.BasicGenericsKt::main);
    }

    @Test
    public void testPerform() {
        testExample("../AtomicKotlinCourse/Advanced Topics/More about Generics/Examples/src/Perform.kt", generics.PerformKt::main);
    }

    @Test
    public void testHolder() {
        testExample("../AtomicKotlinCourse/Advanced Topics/More about Generics/Examples/src/Holder.kt", generics.HolderKt::main);
    }

    @Test
    public void testCarHolder() {
        testExample("../AtomicKotlinCourse/Advanced Topics/More about Generics/Examples/src/CarHolder.kt", generics.CarHolderKt::main);
    }

    @Test
    public void testGenericSpeakers() {
        testExample("../AtomicKotlinCourse/Advanced Topics/More about Generics/Examples/src/GenericSpeakers.kt", generics.GenericSpeakersKt::main);
    }

    @Test
    public void testContravariance() {
        testExample("../AtomicKotlinCourse/Advanced Topics/Variance & Star Projections/Examples/src/Contravariance.kt", variance.ContravarianceKt::main);
    }

    @Test
    public void testCovariantReturnTypes() {
        testExample("../AtomicKotlinCourse/Advanced Topics/Variance & Star Projections/Examples/src/CovariantReturnTypes.kt", variance.CovariantReturnTypesKt::main);
    }

    @Test
    public void testSameReturnTypes() {
        testExample("../AtomicKotlinCourse/Advanced Topics/Variance & Star Projections/Examples/src/SameReturnTypes.kt", variance.SameReturnTypesKt::main);
    }

    @Test
    public void testBird() {
        testExample("../AtomicKotlinCourse/Advanced Topics/Variance & Star Projections/Examples/src/Bird.kt", variance.BirdKt::main);
    }

    @Test
    public void testErasedTypeEquivalence() {
        testExample("../AtomicKotlinCourse/Advanced Topics/Erasure & Reification/Examples/src/ErasedTypeEquivalence.kt", ErasedTypeEquivalenceKt::main);
    }

    @Test
    public void testTypeOfT() {
        testExample("../AtomicKotlinCourse/Advanced Topics/Erasure & Reification/Examples/src/TypeOfT.kt", generics.TypeOfTKt::main);
    }

    @Test
    public void testInfo() {
        testExample("../AtomicKotlinCourse/Advanced Topics/Reflection/Examples/src/Info.kt", InfoKt::main);
    }

    @Test
    public void testSolid() {
        testExample("../AtomicKotlinCourse/Advanced Topics/Reflection/Examples/src/Solid.kt", SolidKt::main);
    }

    @Test
    public void testBigFibonacci() {
        testExample("../AtomicKotlinCourse/Language Interoperability/Mixing Kotlin & Java/Examples/src/BigFibonacci.kt", adaptingjava.BigFibonacciKt::main);
    }

    @Test
    public void testExtensionsToJavaClass() {
        testExample("../AtomicKotlinCourse/Language Interoperability/Mixing Kotlin & Java/Examples/src/ExtensionsToJavaClass.kt", fromkotlin.ExtensionsToJavaClassKt::main);
    }

    @Test
    public void testUseBeanClass() {
        testExample("../AtomicKotlinCourse/Language Interoperability/Mixing Kotlin & Java/Examples/src/UseBeanClass.kt", UseBeanClassKt::main);
    }

    @Test
    public void testRandom() {
        testExample("../AtomicKotlinCourse/Language Interoperability/Mixing Kotlin & Java/Examples/src/Random.kt", RandomKt::main);
    }

    @Test
    public void testKotlinChecked() {
        //testExample("../AtomicKotlinCourse/Language Interoperability/Java Checked Exceptions & Kotlin/Examples/src/KotlinChecked.kt", KotlinCheckedKt::main);
    }

    @Test
    public void testWithCleanup() {
        //testExample("../AtomicKotlinCourse/Language Interoperability/Java Checked Exceptions & Kotlin/Examples/src/WithCleanup.kt", withfunction.WithCleanupKt::main);
    }

    @Test
    public void testPlatformTypes() {
        testExample("../AtomicKotlinCourse/Language Interoperability/Nullable Types & Java/Examples/src/PlatformTypes.kt", PlatformTypesKt::main);
    }

    @Test
    public void testNPEOnPlatformType() {
        testExample("../AtomicKotlinCourse/Language Interoperability/Nullable Types & Java/Examples/src/NPEOnPlatformType.kt", NPEOnPlatformTypeKt::main);
    }

    @Test
    public void testAnnotatedJava() {
        testExample("../AtomicKotlinCourse/Language Interoperability/Nullability Annotations/Examples/src/AnnotatedJava.kt", nullabilityannotations.AnnotatedJavaKt::main);
    }

    @Test
    public void testReadOnlyCollections() {
        testExample("../AtomicKotlinCourse/Language Interoperability/Collections & Java/Examples/src/ReadOnlyCollections.kt", ReadOnlyCollectionsKt::main);
    }

    @Test
    public void testHiddenArrayList() {
        testExample("../AtomicKotlinCourse/Language Interoperability/Collections & Java/Examples/src/HiddenArrayList.kt", HiddenArrayListKt::main);
    }

    @Test
    public void testJavaList() {
        testExample("../AtomicKotlinCourse/Language Interoperability/Collections & Java/Examples/src/JavaList.kt", JavaListKt::main);
    }

    @Test
    public void testTask() {
        testExample("../AtomicKotlinCourse/Programming Basics/Hello, World!/Exercise 1/src/Task.kt", helloWorld1.TaskKt::main);
    }

    @Test
    public void testTask1() {
        testExample("../AtomicKotlinCourse/Programming Basics/Hello, World!/Exercise 2/src/Task.kt", helloWorld2.TaskKt::main);
    }

    @Test
    public void testTask2() {
        testExample("../AtomicKotlinCourse/Programming Basics/Hello, World!/Exercise 3/src/Task.kt", helloWorld3.TaskKt::main);
    }

    @Test
    public void testTask3() {
        testExample("../AtomicKotlinCourse/Programming Basics/Hello, World!/Exercise 4/src/Task.kt", helloWorld4.TaskKt::main);
    }

    @Test
    public void testTask4() {
        testExample("../AtomicKotlinCourse/Programming Basics/var & val/Exercise 1/src/Task.kt", varandval1.TaskKt::main);
    }

    @Test
    public void testTask5() {
        testExample("../AtomicKotlinCourse/Programming Basics/var & val/Exercise 2/src/Task.kt", varandval2.TaskKt::main);
    }

    @Test
    public void testTask6() {
        testExample("../AtomicKotlinCourse/Programming Basics/var & val/Exercise 3/src/Task.kt", varandval3.TaskKt::main);
    }

    @Test
    public void testTask7() {
        testExample("../AtomicKotlinCourse/Programming Basics/var & val/Exercise 4/src/Task.kt", varandval4.TaskKt::main);
    }

    @Test
    public void testTask8() {
        testExample("../AtomicKotlinCourse/Programming Basics/Data Types/Exercise 1/src/Task.kt", dataTypes.TaskKt::main);
    }

    @Test
    public void testTask9() {
        testExample("../AtomicKotlinCourse/Programming Basics/Data Types/Exercise 2/src/Task.kt", dataTypes2.TaskKt::main);
    }

    @Test
    public void testTask10() {
        testExample("../AtomicKotlinCourse/Programming Basics/Functions/Exercise 1/src/Task.kt", functions1.TaskKt::main);
    }

    @Test
    public void testTask11() {
        testExample("../AtomicKotlinCourse/Programming Basics/Functions/Exercise 2/src/Task.kt", functions2.TaskKt::main);
    }

    @Test
    public void testTask12() {
        testExample("../AtomicKotlinCourse/Programming Basics/Functions/Exercise 3/src/Task.kt", functions3.TaskKt::main);
    }

    @Test
    public void testTask13() {
        testExample("../AtomicKotlinCourse/Programming Basics/Functions/Exercise 4/src/Task.kt", functions4.TaskKt::main);
    }

    @Test
    public void testTask14() {
        testExample("../AtomicKotlinCourse/Programming Basics/if Expressions/Exercise 1/src/Task.kt", ifExpressions1.TaskKt::main);
    }

    @Test
    public void testTask15() {
        testExample("../AtomicKotlinCourse/Programming Basics/if Expressions/Exercise 2/src/Task.kt", ifExpressions2.TaskKt::main);
    }

    @Test
    public void testTask16() {
        testExample("../AtomicKotlinCourse/Programming Basics/if Expressions/Exercise 3/src/Task.kt", ifExpressions3.TaskKt::main);
    }

    @Test
    public void testTask17() {
        testExample("../AtomicKotlinCourse/Programming Basics/if Expressions/Exercise 4/src/Task.kt", ifExpressions4.TaskKt::main);
    }

    @Test
    public void testTask18() {
        testExample("../AtomicKotlinCourse/Programming Basics/String Templates/Exercise 1/src/Task.kt", stringTemplates1.TaskKt::main);
    }

    @Test
    public void testTask19() {
        testExample("../AtomicKotlinCourse/Programming Basics/String Templates/Exercise 2/src/Task.kt", stringTemplates2.TaskKt::main);
    }

    @Test
    public void testTask20() {
        testExample("../AtomicKotlinCourse/Programming Basics/String Templates/Exercise 3/src/Task.kt", stringTemplates3.TaskKt::main);
    }

    @Test
    public void testTask21() {
        testExample("../AtomicKotlinCourse/Programming Basics/String Templates/Exercise 4/src/Task.kt", stringTemplates4.TaskKt::main);
    }

    @Test
    public void testTask22() {
        testExample("../AtomicKotlinCourse/Programming Basics/Number Types/Exercise 3/src/Task.kt", numberTypes3.TaskKt::main);
    }

    @Test
    public void testTask23() {
        testExample("../AtomicKotlinCourse/Programming Basics/Number Types/Exercise 4/src/Task.kt", numberTypes4.TaskKt::main);
    }

    @Test
    public void testTask24() {
        testExample("../AtomicKotlinCourse/Programming Basics/Number Types/Exercise 5/src/Task.kt", numberTypes5.TaskKt::main);
    }

    @Test
    public void testTask25() {
        testExample("../AtomicKotlinCourse/Programming Basics/Booleans/Exercise 2/src/Task.kt", booleans2.TaskKt::main);
    }

    @Test
    public void testTask26() {
        testExample("../AtomicKotlinCourse/Programming Basics/Booleans/Exercise 3/src/Task.kt", booleans3.TaskKt::main);
    }

    @Test
    public void testTask27() {
        testExample("../AtomicKotlinCourse/Programming Basics/Repetition with while/Exercise 1/src/Task.kt", repetitionwithwhile1.TaskKt::main);
    }

    @Test
    public void testTask28() {
        testExample("../AtomicKotlinCourse/Programming Basics/Repetition with while/Exercise 2/src/Task.kt", repetitionwithwhile2.TaskKt::main);
    }

    @Test
    public void testTask29() {
        testExample("../AtomicKotlinCourse/Programming Basics/Repetition with while/Exercise 3/src/Task.kt", repetitionwithwhile3.TaskKt::main);
    }

    @Test
    public void testTask30() {
        testExample("../AtomicKotlinCourse/Programming Basics/Repetition with while/Exercise 4/src/Task.kt", repetitionwithwhile4.TaskKt::main);
    }

    @Test
    public void testTask31() {
        testExample("../AtomicKotlinCourse/Programming Basics/Looping & Ranges/Exercise 1/src/Task.kt", loopingandRanges1.TaskKt::main);
    }

    @Test
    public void testTask32() {
        testExample("../AtomicKotlinCourse/Programming Basics/Looping & Ranges/Exercise 2/src/Task.kt", loopingandRanges2.TaskKt::main);
    }

    @Test
    public void testTask33() {
        testExample("../AtomicKotlinCourse/Programming Basics/Looping & Ranges/Exercise 3/src/Task.kt", loopingandRanges3.TaskKt::main);
    }

    @Test
    public void testTask34() {
        testExample("../AtomicKotlinCourse/Programming Basics/Looping & Ranges/Exercise 4/src/Task.kt", loopingandRanges4.TaskKt::main);
    }

    @Test
    public void testTask35() {
        testExample("../AtomicKotlinCourse/Programming Basics/Looping & Ranges/Exercise 5/src/Task.kt", loopingandRanges5.TaskKt::main);
    }

    @Test
    public void testTask36() {
        testExample("../AtomicKotlinCourse/Programming Basics/The in Keyword/Exercise 1/src/Task.kt", theinKeyword1.TaskKt::main);
    }

    @Test
    public void testTask37() {
        testExample("../AtomicKotlinCourse/Programming Basics/The in Keyword/Exercise 2/src/Task.kt", theinKeyword2.TaskKt::main);
    }

    @Test
    public void testTask38() {
        testExample("../AtomicKotlinCourse/Programming Basics/The in Keyword/Exercise 3/src/Task.kt", theinKeyword3.TaskKt::main);
    }

    @Test
    public void testTask39() {
        testExample("../AtomicKotlinCourse/Programming Basics/The in Keyword/Exercise 4/src/Task.kt", theinKeyword4.TaskKt::main);
    }

    @Test
    public void testTask40() {
        testExample("../AtomicKotlinCourse/Programming Basics/Expressions & Statements/Exercise 1/src/Task.kt", expressionsandStatements1.TaskKt::main);
    }

    @Test
    public void testTask41() {
        testExample("../AtomicKotlinCourse/Programming Basics/Expressions & Statements/Exercise 2/src/Task.kt", expressionsandStatements2.TaskKt::main);
    }

    @Test
    public void testTask42() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Exercise 1/src/Task.kt", summary1.TaskKt::main);
    }

    @Test
    public void testTask43() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Exercise 2/src/Task.kt", summary2.TaskKt::main);
    }

    @Test
    public void testTask44() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Exercise 3/src/Task.kt", summary3.TaskKt::main);
    }

    @Test
    public void testTask45() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Exercise 4/src/Task.kt", summary4.TaskKt::main);
    }

    @Test
    public void testTask46() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Objects Everywhere/Exercise 1/src/Task.kt", objectsEverywhere1.TaskKt::main);
    }

    @Test
    public void testTask47() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Objects Everywhere/Exercise 2/src/Task.kt", objectsEverywhere2.TaskKt::main);
    }

    @Test
    public void testTask48() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Objects Everywhere/Exercise 3/src/Task.kt", objectsEverywhere3.TaskKt::main);
    }

    @Test
    public void testTask49() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Objects Everywhere/Exercise 4/src/Task.kt", objectsEverywhere4.TaskKt::main);
    }

    @Test
    public void testTask50() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Objects Everywhere/Exercise 5/src/Task.kt", objectsEverywhere5.TaskKt::main);
    }

    @Test
    public void testTask51() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Creating Classes/Exercise 1/src/Task.kt", creatingClasses1.TaskKt::main);
    }

    @Test
    public void testTask52() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Creating Classes/Exercise 2/src/Task.kt", creatingClasses3.TaskKt::main);
    }

    @Test
    public void testTask53() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Creating Classes/Exercise 3/src/Task.kt", creatingClasses4.TaskKt::main);
    }

    @Test
    public void testTask54() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Properties/Exercise 1/src/Task.kt", properties1.TaskKt::main);
    }

    @Test
    public void testTask55() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Properties/Exercise 2/src/Task.kt", properties2.TaskKt::main);
    }

    @Test
    public void testTask56() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Constructors/Exercise 2/src/Task.kt", constructors2.TaskKt::main);
    }

    @Test
    public void testTask57() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Constructors/Exercise 3/src/Task.kt", constructors3.TaskKt::main);
    }

    @Test
    public void testTask58() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Constraining Visibility/Exercise 1/src/Task.kt", constrainingVisibility1.TaskKt::main);
    }

    @Test
    public void testTask59() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Constraining Visibility/Exercise 2/src/Task.kt", constrainingVisibility2.TaskKt::main);
    }

    @Test
    public void testTask60() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Constraining Visibility/Exercise 3/src/Task.kt", constrainingVisibility3.TaskKt::main);
    }

    @Test
    public void testTask61() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Constraining Visibility/Exercise 4/src/Task.kt", constrainingVisibility4.TaskKt::main);
    }

    @Test
    public void testMain() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Imports & Packages/Exercise 1/src/Main.kt", importsandPackages1.MainKt::main);
    }

    @Test
    public void testTask62() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Imports & Packages/Exercise 2/src/Task.kt", importsandPackages2.TaskKt::main);
    }

    @Test
    public void testTask63() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Testing/Exercise 1/src/Task.kt", testing1.TaskKt::main);
    }

    @Test
    public void testTask64() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Testing/Exercise 2/src/Task.kt", testing2.TaskKt::main);
    }

    @Test
    public void testTask65() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Exceptions/Exercise 1/src/Task.kt", exceptions1.TaskKt::main);
    }

    @Test
    public void testTask66() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Lists/Exercise 1/src/Task.kt", lists1.TaskKt::main);
    }

    @Test
    public void testTask67() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Lists/Exercise 2/src/Task.kt", lists2.TaskKt::main);
    }

    @Test
    public void testTask68() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Lists/Exercise 3/src/Task.kt", lists3.TaskKt::main);
    }

    @Test
    public void testTask69() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Lists/Exercise 4/src/Task.kt", lists4.TaskKt::main);
    }

    @Test
    public void testTask70() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/vararg Arguments/Exercise 1/src/Task.kt", varargArguments1.TaskKt::main);
    }

    @Test
    public void testTask71() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/vararg Arguments/Exercise 2/src/Task.kt", varargArguments2.TaskKt::main);
    }

    @Test
    public void testTask72() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/vararg Arguments/Exercise 3/src/Task.kt", varargArguments3.TaskKt::main);
    }

    @Test
    public void testTask73() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Sets/Exercise 1/src/Task.kt", sets1.TaskKt::main);
    }

    @Test
    public void testTask74() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Sets/Exercise 2/src/Task.kt", sets2.TaskKt::main);
    }

    @Test
    public void testTask75() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Sets/Exercise 3/src/Task.kt", sets3.TaskKt::main);
    }

    @Test
    public void testTask76() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Maps/Exercise 1/src/Task.kt", maps1.TaskKt::main);
    }

    @Test
    public void testTask77() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Maps/Exercise 2/src/Task.kt", maps2.TaskKt::main);
    }

    @Test
    public void testTask78() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Maps/Exercise 3/src/Task.kt", maps3.TaskKt::main);
    }

    @Test
    public void testTask79() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Maps/Exercise 4/src/Task.kt", maps4.TaskKt::main);
    }

    @Test
    public void testTask80() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Property Accessors/Exercise 1/src/Task.kt", propertyAccessors1.TaskKt::main);
    }

    @Test
    public void testTask81() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Property Accessors/Exercise 2/src/Task.kt", propertyAccessors2.TaskKt::main);
    }

    @Test
    public void testTask82() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Property Accessors/Exercise 3/src/Task.kt", propertyAccessors3.TaskKt::main);
    }

    @Test
    public void testTask83() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Exercise 1/src/Task.kt", summary21.TaskKt::main);
    }

    @Test
    public void testTask84() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Exercise 2/src/Task.kt", summary22.TaskKt::main);
    }

    @Test
    public void testTask85() {
        testExample("../AtomicKotlinCourse/Usability/Extension Functions/Exercise 1/src/Task.kt", extensionFunctions1.TaskKt::main);
    }

    @Test
    public void testTask86() {
        testExample("../AtomicKotlinCourse/Usability/Extension Functions/Exercise 2/src/Task.kt", extensionFunctions2.TaskKt::main);
    }

    @Test
    public void testTask87() {
        testExample("../AtomicKotlinCourse/Usability/Extension Functions/Exercise 3/src/Task.kt", extensionFunctions3.TaskKt::main);
    }

    @Test
    public void testTask88() {
        testExample("../AtomicKotlinCourse/Usability/Extension Functions/Exercise 4/src/Task.kt", extensionFunctions4.TaskKt::main);
    }

    @Test
    public void testTask89() {
        testExample("../AtomicKotlinCourse/Usability/Named & Default Arguments/Exercise 2/src/Task.kt", namedandDefaultArguments2.TaskKt::main);
    }

    @Test
    public void testTask90() {
        testExample("../AtomicKotlinCourse/Usability/Named & Default Arguments/Exercise 3/src/Task.kt", namedandDefaultArguments3.TaskKt::main);
    }

    @Test
    public void testTask91() {
        testExample("../AtomicKotlinCourse/Usability/Overloading/Exercise 1/src/Task.kt", overloading1.TaskKt::main);
    }

    @Test
    public void testTask92() {
        testExample("../AtomicKotlinCourse/Usability/Overloading/Exercise 2/src/Task.kt", overloading2.TaskKt::main);
    }

    @Test
    public void testTask93() {
        testExample("../AtomicKotlinCourse/Usability/when Expressions/Exercise 1/src/Task.kt", whenExpressions1.TaskKt::main);
    }

    @Test
    public void testTask94() {
        testExample("../AtomicKotlinCourse/Usability/when Expressions/Exercise 2/src/Task.kt", whenExpressions2.TaskKt::main);
    }

    @Test
    public void testTask95() {
        testExample("../AtomicKotlinCourse/Usability/when Expressions/Exercise 3/src/Task.kt", whenExpressions3.TaskKt::main);
    }

    @Test
    public void testTask96() {
        testExample("../AtomicKotlinCourse/Usability/when Expressions/Exercise 4/src/Task.kt", whenExpressions4.TaskKt::main);
    }

    @Test
    public void testTask97() {
        testExample("../AtomicKotlinCourse/Usability/Enumerations/Exercise 1/src/Task.kt", enumerations1.TaskKt::main);
    }

    @Test
    public void testTask98() {
        testExample("../AtomicKotlinCourse/Usability/Enumerations/Exercise 2/src/Task.kt", enumerations2.TaskKt::main);
    }

    @Test
    public void testTask99() {
        testExample("../AtomicKotlinCourse/Usability/Enumerations/Exercise 3/src/Task.kt", enumerations3.TaskKt::main);
    }

    @Test
    public void testTask100() {
        testExample("../AtomicKotlinCourse/Usability/Data Classes/Exercise 1/src/Task.kt", dataClasses1.TaskKt::main);
    }

    @Test
    public void testTask101() {
        testExample("../AtomicKotlinCourse/Usability/Data Classes/Exercise 2/src/Task.kt", dataClasses2.TaskKt::main);
    }

    @Test
    public void testTask102() {
        testExample("../AtomicKotlinCourse/Usability/Nullable Types/Exercise 1/src/Task.kt", nullableTypes1.TaskKt::main);
    }

    @Test
    public void testTask103() {
        testExample("../AtomicKotlinCourse/Usability/Nullable Types/Exercise 2/src/Task.kt", nullableTypes2.TaskKt::main);
    }

    @Test
    public void testTask104() {
        testExample("../AtomicKotlinCourse/Usability/Safe Calls & the Elvis Operator/Exercise 1/src/Task.kt", safeCallsandTheElvisOperator1.TaskKt::main);
    }

    @Test
    public void testTask105() {
        testExample("../AtomicKotlinCourse/Usability/Safe Calls & the Elvis Operator/Exercise 2/src/Task.kt", safeCallsandTheElvisOperator2.TaskKt::main);
    }

    @Test
    public void testTask106() {
        testExample("../AtomicKotlinCourse/Usability/Non-null Assertions/Exercise 1/src/Task.kt", nonnullAssertions1.TaskKt::main);
    }

    @Test
    public void testTask107() {
        testExample("../AtomicKotlinCourse/Usability/Non-null Assertions/Exercise 2/src/Task.kt", nonnullAssertions2.TaskKt::main);
    }

    @Test
    public void testTask108() {
        testExample("../AtomicKotlinCourse/Usability/Extensions for Nullable Types/Exercise 1/src/Task.kt", extensionsforNullableTypes1.TaskKt::main);
    }

    @Test
    public void testTask109() {
        testExample("../AtomicKotlinCourse/Usability/Extensions for Nullable Types/Exercise 2/src/Task.kt", extensionsforNullableTypes2.TaskKt::main);
    }

    @Test
    public void testTask110() {
        testExample("../AtomicKotlinCourse/Usability/Introduction to Generics/Exercise 1/src/Task.kt", introductiontoGenerics1.TaskKt::main);
    }

    @Test
    public void testTask111() {
        testExample("../AtomicKotlinCourse/Usability/Introduction to Generics/Exercise 2/src/Task.kt", introductiontoGenerics2.TaskKt::main);
    }

    @Test
    public void testTask112() {
        testExample("../AtomicKotlinCourse/Usability/Extension Properties/Exercise 1/src/Task.kt", extensionProperties1.TaskKt::main);
    }

    @Test
    public void testTask113() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambdas/Exercise 1/src/Task.kt", lambdas1.TaskKt::main);
    }

    @Test
    public void testTask114() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambdas/Exercise 2/src/Task.kt", lambdas2.TaskKt::main);
    }

    @Test
    public void testTask115() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambdas/Exercise 3/src/Task.kt", lambdas3.TaskKt::main);
    }

    @Test
    public void testTask116() {
        testExample("../AtomicKotlinCourse/Functional Programming/The Importance of Lambdas/Exercise 1/src/Task.kt", theImportanceofLambdas1.TaskKt::main);
    }

    @Test
    public void testTask117() {
        testExample("../AtomicKotlinCourse/Functional Programming/The Importance of Lambdas/Exercise 2/src/Task.kt", theImportanceofLambdas2.TaskKt::main);
    }

    @Test
    public void testTask118() {
        testExample("../AtomicKotlinCourse/Functional Programming/Operations on Collections/Exercise 1/src/Task.kt", operationsonCollections1.TaskKt::main);
    }

    @Test
    public void testTask119() {
        testExample("../AtomicKotlinCourse/Functional Programming/Operations on Collections/Exercise 2/src/Task.kt", operationsonCollections2.TaskKt::main);
    }

    @Test
    public void testTask120() {
        testExample("../AtomicKotlinCourse/Functional Programming/Operations on Collections/Exercise 3/src/Task.kt", operationsonCollections3.TaskKt::main);
    }

    @Test
    public void testTask121() {
        testExample("../AtomicKotlinCourse/Functional Programming/Operations on Collections/Exercise 4/src/Task.kt", operationsonCollections4.TaskKt::main);
    }

    @Test
    public void testTask122() {
        testExample("../AtomicKotlinCourse/Functional Programming/Member References/Exercise 1/src/Task.kt", memberReferences01.TaskKt::main);
    }

    @Test
    public void testTask123() {
        testExample("../AtomicKotlinCourse/Functional Programming/Member References/Exercise 2/src/Task.kt", memberReferences02.TaskKt::main);
    }

    @Test
    public void testTask124() {
        testExample("../AtomicKotlinCourse/Functional Programming/Function Types/Exercise 1/src/Task.kt", functionTypes1.TaskKt::main);
    }

    @Test
    public void testTask125() {
        testExample("../AtomicKotlinCourse/Functional Programming/Function Types/Exercise 2/src/Task.kt", functionTypes2.TaskKt::main);
    }

    @Test
    public void testTask126() {
        testExample("../AtomicKotlinCourse/Functional Programming/Function Types/Exercise 3/src/Task.kt", functionTypes3.TaskKt::main);
    }

    @Test
    public void testTask127() {
        testExample("../AtomicKotlinCourse/Functional Programming/Function Types/Exercise 4/src/Task.kt", functionTypes4.TaskKt::main);
    }

    @Test
    public void testTask128() {
        testExample("../AtomicKotlinCourse/Functional Programming/Manipulating Lists/Exercise 1/src/Task.kt", manipulatingLists1.TaskKt::main);
    }

    @Test
    public void testTask129() {
        testExample("../AtomicKotlinCourse/Functional Programming/Manipulating Lists/Exercise 2/src/Task.kt", manipulatingLists2.TaskKt::main);
    }

    @Test
    public void testTask130() {
        testExample("../AtomicKotlinCourse/Functional Programming/Manipulating Lists/Exercise 3/src/Task.kt", manipulatingLists3.TaskKt::main);
    }

    @Test
    public void testTask131() {
        testExample("../AtomicKotlinCourse/Functional Programming/Manipulating Lists/Exercise 4/src/Task.kt", manipulatingLists4.TaskKt::main);
    }

    @Test
    public void testTask132() {
        testExample("../AtomicKotlinCourse/Functional Programming/Manipulating Lists/Exercise 5/src/Task.kt", manipulatingLists5.TaskKt::main);
    }

    @Test
    public void testTask133() {
        testExample("../AtomicKotlinCourse/Functional Programming/Manipulating Lists/Exercise 6/src/Task.kt", manipulatingLists6.TaskKt::main);
    }

    @Test
    public void testTask134() {
        testExample("../AtomicKotlinCourse/Functional Programming/Manipulating Lists/Exercise 7/src/Task.kt", manipulatingLists7.TaskKt::main);
    }

    @Test
    public void testTask135() {
        testExample("../AtomicKotlinCourse/Functional Programming/From Lists to Maps/Exercise 1/src/Task.kt", fromListstoMaps01.TaskKt::main);
    }

    @Test
    public void testTask136() {
        testExample("../AtomicKotlinCourse/Functional Programming/From Lists to Maps/Exercise 2/src/Task.kt", fromListstoMaps02.TaskKt::main);
    }

    @Test
    public void testTask137() {
        testExample("../AtomicKotlinCourse/Functional Programming/From Lists to Maps/Exercise 3/src/Task.kt", fromListstoMaps03.TaskKt::main);
    }

    @Test
    public void testTask138() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambda with Receiver/Exercise 1/src/Task.kt", lambdawithReceiver1.TaskKt::main);
    }

    @Test
    public void testTask139() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambda with Receiver/Exercise 2/src/Task.kt", lambdawithReceiver2.TaskKt::main);
    }

    @Test
    public void testTask140() {
        testExample("../AtomicKotlinCourse/Functional Programming/The with() Function/Exercise 1/src/Task.kt", thewithFunction1.TaskKt::main);
    }

    @Test
    public void testTask141() {
        testExample("../AtomicKotlinCourse/Functional Programming/The with() Function/Exercise 2/src/Task.kt", thewithFunction2.TaskKt::main);
    }

    @Test
    public void testTask142() {
        testExample("../AtomicKotlinCourse/Functional Programming/Library Helpers/Exercise 1/src/Task.kt", libraryHelpers1.TaskKt::main);
    }

    @Test
    public void testTask143() {
        testExample("../AtomicKotlinCourse/Functional Programming/Library Helpers/Exercise 2/src/Task.kt", libraryHelpers2.TaskKt::main);
    }

    @Test
    public void testTask144() {
        testExample("../AtomicKotlinCourse/Functional Programming/Library Helpers/Exercise 3/src/Task.kt", libraryhelpers.TaskKt::main);
    }

    @Test
    public void testTask145() {
        testExample("../AtomicKotlinCourse/Functional Programming/More Library Functions/Exercise 1/src/Task.kt", moreLibraryFunctions1.TaskKt::main);
    }

    @Test
    public void testTask146() {
        testExample("../AtomicKotlinCourse/Functional Programming/More Library Functions/Exercise 2/src/Task.kt", moreLibraryFunctions2.TaskKt::main);
    }

    @Test
    public void testTask147() {
        testExample("../AtomicKotlinCourse/Functional Programming/Functions Inside Functions/Exercise 1/src/Task.kt", functionsInsideFunctions1.TaskKt::main);
    }

    @Test
    public void testTask148() {
        testExample("../AtomicKotlinCourse/Functional Programming/Folding Lists/Exercise 1/src/Task.kt", foldingLists01.TaskKt::main);
    }

    @Test
    public void testTask149() {
        testExample("../AtomicKotlinCourse/Functional Programming/Folding Lists/Exercise 2/src/Task.kt", foldingLists02.TaskKt::main);
    }

    @Test
    public void testTask150() {
        testExample("../AtomicKotlinCourse/Functional Programming/Folding Lists/Exercise 3/src/Task.kt", foldingLists3.TaskKt::main);
    }

    @Test
    public void testTask151() {
        testExample("../AtomicKotlinCourse/Functional Programming/Folding Lists/Exercise 4/src/Task.kt", foldingLists4.TaskKt::main);
    }

    @Test
    public void testTask152() {
        testExample("../AtomicKotlinCourse/Functional Programming/Recursion/Exercise 1/src/Task.kt", recursion1.TaskKt::main);
    }

    @Test
    public void testTask153() {
        testExample("../AtomicKotlinCourse/Functional Programming/Recursion/Exercise 2/src/Task.kt", recursion2.TaskKt::main);
    }

    @Test
    public void testTask154() {
        testExample("../AtomicKotlinCourse/Functional Programming/Recursion/Exercise 3/src/Task.kt", recursion3.TaskKt::main);
    }

    @Test
    public void testGameMatrix1() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Interfaces/Exercise 1/src/GameMatrix.kt", interfaces1.GameMatrixKt::main);
    }

    @Test
    public void testGameMatrix2() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Complex Constructors/Exercise 1/src/GameMatrix.kt", complexConstructors1.GameMatrixKt::main);
    }

    @Test
    public void testGardenItem1() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Secondary Constructors/Exercise 1/src/GardenItem.kt", secondaryConstructors1.GardenItemKt::main);
    }

    @Test
    public void testMaze() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Inheritance/Exercise 1/src/Maze.kt", inheritance1.MazeKt::main);
    }

    @Test
    public void testBomb() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Inheritance/Exercise 2/src/Bomb.kt", inheritance2.BombKt::main);
    }

    @Test
    public void testGameElements() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Base Class Initialization/Exercise 1/src/GameElements.kt", baseClassInitialization1.GameElementsKt::main);
    }

    @Test
    public void testMonster() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Abstract Classes/Exercise 1/src/Monster.kt", abstractClasses1.MonsterKt::main);
    }
}