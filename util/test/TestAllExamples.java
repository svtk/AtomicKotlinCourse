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
    public void testVars() {
        testExample("../AtomicKotlinCourse/Programming Basics/var & val/Examples/src/Vars.kt", VarsKt::main);
    }

    @Test
    public void testAVarIsMutable() {
        testExample("../AtomicKotlinCourse/Programming Basics/var & val/Examples/src/AVarIsMutable.kt", AVarIsMutableKt::main);
    }

    @Test
    public void testVals() {
        testExample("../AtomicKotlinCourse/Programming Basics/var & val/Examples/src/Vals.kt", ValsKt::main);
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
    public void testInference() {
        testExample("../AtomicKotlinCourse/Programming Basics/Data Types/Examples/src/Inference.kt", InferenceKt::main);
    }

    @Test
    public void testMultiplyByTwo() {
        testExample("../AtomicKotlinCourse/Programming Basics/Functions/Examples/src/MultiplyByTwo.kt", MultiplyByTwoKt::main);
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
    public void testMultiplyByFour() {
        testExample("../AtomicKotlinCourse/Programming Basics/Functions/Examples/src/MultiplyByFour.kt", MultiplyByFourKt::main);
    }

    @Test
    public void testIf1() {
        testExample("../AtomicKotlinCourse/Programming Basics/if Expressions/Examples/src/If1.kt", If1Kt::main);
    }

    @Test
    public void testIf2() {
        testExample("../AtomicKotlinCourse/Programming Basics/if Expressions/Examples/src/If2.kt", If2Kt::main);
    }

    @Test
    public void testIf3() {
        testExample("../AtomicKotlinCourse/Programming Basics/if Expressions/Examples/src/If3.kt", If3Kt::main);
    }

    @Test
    public void testIf4() {
        testExample("../AtomicKotlinCourse/Programming Basics/if Expressions/Examples/src/If4.kt", If4Kt::main);
    }

    @Test
    public void testIf5() {
        testExample("../AtomicKotlinCourse/Programming Basics/if Expressions/Examples/src/If5.kt", If5Kt::main);
    }

    @Test
    public void testIf6() {
        testExample("../AtomicKotlinCourse/Programming Basics/if Expressions/Examples/src/If6.kt", If6Kt::main);
    }

    @Test
    public void testTrueOrFalse() {
        testExample("../AtomicKotlinCourse/Programming Basics/if Expressions/Examples/src/TrueOrFalse.kt", TrueOrFalseKt::main);
    }

    @Test
    public void testOneOrTheOther() {
        testExample("../AtomicKotlinCourse/Programming Basics/if Expressions/Examples/src/OneOrTheOther.kt", OneOrTheOtherKt::main);
    }

    @Test
    public void testStringTemplates() {
        testExample("../AtomicKotlinCourse/Programming Basics/String Templates/Examples/src/StringTemplates.kt", StringTemplatesKt::main);
    }

    @Test
    public void testStringConcatenation() {
        testExample("../AtomicKotlinCourse/Programming Basics/String Templates/Examples/src/StringConcatenation.kt", StringConcatenationKt::main);
    }

    @Test
    public void testExpressionInTemplate() {
        testExample("../AtomicKotlinCourse/Programming Basics/String Templates/Examples/src/ExpressionInTemplate.kt", ExpressionInTemplateKt::main);
    }

    @Test
    public void testTripleQuotes() {
        testExample("../AtomicKotlinCourse/Programming Basics/String Templates/Examples/src/TripleQuotes.kt", TripleQuotesKt::main);
    }

    @Test
    public void testInferInt() {
        testExample("../AtomicKotlinCourse/Programming Basics/Number Types/Examples/src/InferInt.kt", InferIntKt::main);
    }

    @Test
    public void testModulus() {
        testExample("../AtomicKotlinCourse/Programming Basics/Number Types/Examples/src/Modulus.kt", ModulusKt::main);
    }

    @Test
    public void testIntDivisionTruncates() {
        testExample("../AtomicKotlinCourse/Programming Basics/Number Types/Examples/src/IntDivisionTruncates.kt", IntDivisionTruncatesKt::main);
    }

    @Test
    public void testOpOrder() {
        testExample("../AtomicKotlinCourse/Programming Basics/Number Types/Examples/src/OpOrder.kt", OpOrderKt::main);
    }

    @Test
    public void testOpOrderParens() {
        testExample("../AtomicKotlinCourse/Programming Basics/Number Types/Examples/src/OpOrderParens.kt", OpOrderParensKt::main);
    }

    @Test
    public void testBMIMetric() {
        testExample("../AtomicKotlinCourse/Programming Basics/Number Types/Examples/src/BMIMetric.kt", BMIMetricKt::main);
    }

    @Test
    public void testBMIEnglish() {
        testExample("../AtomicKotlinCourse/Programming Basics/Number Types/Examples/src/BMIEnglish.kt", BMIEnglishKt::main);
    }

    @Test
    public void testIntegerOverflow() {
        testExample("../AtomicKotlinCourse/Programming Basics/Number Types/Examples/src/IntegerOverflow.kt", IntegerOverflowKt::main);
    }

    @Test
    public void testLongConstants() {
        testExample("../AtomicKotlinCourse/Programming Basics/Number Types/Examples/src/LongConstants.kt", LongConstantsKt::main);
    }

    @Test
    public void testUsingLongs() {
        testExample("../AtomicKotlinCourse/Programming Basics/Number Types/Examples/src/UsingLongs.kt", UsingLongsKt::main);
    }

    @Test
    public void testBiggestLong() {
        testExample("../AtomicKotlinCourse/Programming Basics/Number Types/Examples/src/BiggestLong.kt", BiggestLongKt::main);
    }

    @Test
    public void testOpen1() {
        testExample("../AtomicKotlinCourse/Programming Basics/Booleans/Examples/src/Open1.kt", Open1Kt::main);
    }

    @Test
    public void testOpen2() {
        testExample("../AtomicKotlinCourse/Programming Basics/Booleans/Examples/src/Open2.kt", Open2Kt::main);
    }

    @Test
    public void testClosed() {
        testExample("../AtomicKotlinCourse/Programming Basics/Booleans/Examples/src/Closed.kt", ClosedKt::main);
    }

    @Test
    public void testEvaluationOrder() {
        testExample("../AtomicKotlinCourse/Programming Basics/Booleans/Examples/src/EvaluationOrder.kt", EvaluationOrderKt::main);
    }

    @Test
    public void testWhileLoop() {
        testExample("../AtomicKotlinCourse/Programming Basics/Repetition with while/Examples/src/WhileLoop.kt", WhileLoopKt::main);
    }

    @Test
    public void testDoWhileLoop() {
        testExample("../AtomicKotlinCourse/Programming Basics/Repetition with while/Examples/src/DoWhileLoop.kt", DoWhileLoopKt::main);
    }

    @Test
    public void testAssignmentOperators() {
        testExample("../AtomicKotlinCourse/Programming Basics/Repetition with while/Examples/src/AssignmentOperators.kt", AssignmentOperatorsKt::main);
    }

    @Test
    public void testIncrementOperator() {
        testExample("../AtomicKotlinCourse/Programming Basics/Repetition with while/Examples/src/IncrementOperator.kt", IncrementOperatorKt::main);
    }

    @Test
    public void testRepeatThreeTimes() {
        testExample("../AtomicKotlinCourse/Programming Basics/Looping & Ranges/Examples/src/RepeatThreeTimes.kt", RepeatThreeTimesKt::main);
    }

    @Test
    public void testDefiningRanges() {
        testExample("../AtomicKotlinCourse/Programming Basics/Looping & Ranges/Examples/src/DefiningRanges.kt", DefiningRangesKt::main);
    }

    @Test
    public void testSumUsingRange() {
        testExample("../AtomicKotlinCourse/Programming Basics/Looping & Ranges/Examples/src/SumUsingRange.kt", SumUsingRangeKt::main);
    }

    @Test
    public void testForWithRanges() {
        testExample("../AtomicKotlinCourse/Programming Basics/Looping & Ranges/Examples/src/ForWithRanges.kt", ForWithRangesKt::main);
    }

    @Test
    public void testForWithCharRange() {
        testExample("../AtomicKotlinCourse/Programming Basics/Looping & Ranges/Examples/src/ForWithCharRange.kt", ForWithCharRangeKt::main);
    }

    @Test
    public void testIndexIntoString() {
        testExample("../AtomicKotlinCourse/Programming Basics/Looping & Ranges/Examples/src/IndexIntoString.kt", IndexIntoStringKt::main);
    }

    @Test
    public void testAddingIntToChar() {
        testExample("../AtomicKotlinCourse/Programming Basics/Looping & Ranges/Examples/src/AddingIntToChar.kt", AddingIntToCharKt::main);
    }

    @Test
    public void testIterateOverString() {
        testExample("../AtomicKotlinCourse/Programming Basics/Looping & Ranges/Examples/src/IterateOverString.kt", IterateOverStringKt::main);
    }

    @Test
    public void testHasChar() {
        testExample("../AtomicKotlinCourse/Programming Basics/Looping & Ranges/Examples/src/HasChar.kt", HasCharKt::main);
    }

    @Test
    public void testRepeat() {
        testExample("../AtomicKotlinCourse/Programming Basics/Looping & Ranges/Examples/src/Repeat.kt", RepeatKt::main);
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
    public void testInString() {
        testExample("../AtomicKotlinCourse/Programming Basics/The in Keyword/Examples/src/InString.kt", InStringKt::main);
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
    public void testStringRange() {
        testExample("../AtomicKotlinCourse/Programming Basics/The in Keyword/Examples/src/StringRange.kt", StringRangeKt::main);
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
    public void testAssigningAnIf() {
        testExample("../AtomicKotlinCourse/Programming Basics/Expressions & Statements/Examples/src/AssigningAnIf.kt", AssigningAnIfKt::main);
    }

    @Test
    public void testPostfixVsPrefix() {
        testExample("../AtomicKotlinCourse/Programming Basics/Expressions & Statements/Examples/src/PostfixVsPrefix.kt", PostfixVsPrefixKt::main);
    }

    @Test
    public void testConfusingOperator() {
        testExample("../AtomicKotlinCourse/Programming Basics/Expressions & Statements/Examples/src/ConfusingOperator.kt", ConfusingOperatorKt::main);
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
    public void testBooleans() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Examples/src/Booleans.kt", BooleansKt::main);
    }

    @Test
    public void testIfResult() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Examples/src/IfResult.kt", IfResultKt::main);
    }

    @Test
    public void testIfExpression() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Examples/src/IfExpression.kt", IfExpressionKt::main);
    }

    @Test
    public void testStrTemplates() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Examples/src/StrTemplates.kt", StrTemplatesKt::main);
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
    public void testTruncation() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Examples/src/Truncation.kt", TruncationKt::main);
    }

    @Test
    public void testWhile() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Examples/src/While.kt", WhileKt::main);
    }

    @Test
    public void testDoWhile() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Examples/src/DoWhile.kt", DoWhileKt::main);
    }

    @Test
    public void testStringIteration() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Examples/src/StringIteration.kt", StringIterationKt::main);
    }

    @Test
    public void testRangeOfInt() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Examples/src/RangeOfInt.kt", RangeOfIntKt::main);
    }

    @Test
    public void testMembership() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Examples/src/Membership.kt", MembershipKt::main);
    }

    @Test
    public void testUnitReturn() {
        testExample("../AtomicKotlinCourse/Programming Basics/Summary 1/Examples/src/UnitReturn.kt", UnitReturnKt::main);
    }

    @Test
    public void testIntRanges() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Objects Everywhere/Examples/src/IntRanges.kt", IntRangesKt::main);
    }

    @Test
    public void testRangeSum() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Objects Everywhere/Examples/src/RangeSum.kt", RangeSumKt::main);
    }

    @Test
    public void testStrings() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Objects Everywhere/Examples/src/Strings.kt", StringsKt::main);
    }

    @Test
    public void testConversion() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Objects Everywhere/Examples/src/Conversion.kt", ConversionKt::main);
    }

    @Test
    public void testNumberConversions() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Objects Everywhere/Examples/src/NumberConversions.kt", NumberConversionsKt::main);
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
    public void testCup() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Properties/Examples/src/Cup.kt", CupKt::main);
    }

    @Test
    public void testCup2() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Properties/Examples/src/Cup2.kt", Cup2Kt::main);
    }

    @Test
    public void testChangingAVal() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Properties/Examples/src/ChangingAVal.kt", ChangingAValKt::main);
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
    public void testArg() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Constructors/Examples/src/Arg.kt", ArgKt::main);
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
    public void testDisplayAlienSpecies() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Constructors/Examples/src/DisplayAlienSpecies.kt", DisplayAlienSpeciesKt::main);
    }

    @Test
    public void testGoodAlien() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Constructors/Examples/src/GoodAlien.kt", GoodAlienKt::main);
    }

    @Test
    public void testObserveAnimals() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Constraining Visibility/Examples/src/ObserveAnimals.kt", ObserveAnimalsKt::main);
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
    public void testImportClass() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Imports & Packages/Examples/src/ImportClass.kt", ImportClassKt::main);
    }

    @Test
    public void testImportNameChange() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Imports & Packages/Examples/src/ImportNameChange.kt", ImportNameChangeKt::main);
    }

    @Test
    public void testFullyQualify() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Imports & Packages/Examples/src/FullyQualify.kt", FullyQualifyKt::main);
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
    public void testTestingExample() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Testing/Examples/src/TestingExample.kt", TestingExampleKt::main);
    }

    @Test
    public void testTDDFail() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Testing/Examples/src/TDDFail.kt", testing1.TDDFailKt::main);
    }

    @Test
    public void testTDDStillFails() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Testing/Examples/src/TDDStillFails.kt", testing2.TDDStillFailsKt::main);
    }

    @Test
    public void testTDDWorks() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Testing/Examples/src/TDDWorks.kt", testing3.TDDWorksKt::main);
    }

    @Test
    public void testToIntException() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Exceptions/Examples/src/ToIntException.kt", ToIntExceptionKt::main);
    }

    @Test
    public void testIntroducingCapture() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Exceptions/Examples/src/IntroducingCapture.kt", IntroducingCaptureKt::main);
    }

    @Test
    public void testIntroducingNull() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Exceptions/Examples/src/IntroducingNull.kt", IntroducingNullKt::main);
    }

    @Test
    public void testAverageIncome() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Exceptions/Examples/src/AverageIncome.kt", firstversion.AverageIncomeKt::main);
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
    public void testLists() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Lists/Examples/src/Lists.kt", ListsKt::main);
    }

    @Test
    public void testOutOfBounds() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Lists/Examples/src/OutOfBounds.kt", OutOfBoundsKt::main);
    }

    @Test
    public void testListUsefulFunction() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Lists/Examples/src/ListUsefulFunction.kt", ListUsefulFunctionKt::main);
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
    public void testMutableList() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Lists/Examples/src/MutableList.kt", MutableListKt::main);
    }

    @Test
    public void testMutListIsList() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Lists/Examples/src/MutListIsList.kt", MutListIsListKt::main);
    }

    @Test
    public void testMultipleListRefs() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Lists/Examples/src/MultipleListRefs.kt", MultipleListRefsKt::main);
    }

    @Test
    public void testListOf() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/vararg Arguments/Examples/src/ListOf.kt", ListOfKt::main);
    }

    @Test
    public void testVariableArgList() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/vararg Arguments/Examples/src/VariableArgList.kt", VariableArgListKt::main);
    }

    @Test
    public void testVarargSum() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/vararg Arguments/Examples/src/VarargSum.kt", VarargSumKt::main);
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
    public void testTwoFunctionsWithVarargs() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/vararg Arguments/Examples/src/TwoFunctionsWithVarargs.kt", TwoFunctionsWithVarargsKt::main);
    }

    @Test
    public void testMainArgs() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/vararg Arguments/Examples/src/MainArgs.kt", MainArgsKt::main);
    }

    @Test
    public void testMainArgConversion() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/vararg Arguments/Examples/src/MainArgConversion.kt", MainArgConversionKt::main);
    }

    @Test
    public void testSets() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Sets/Examples/src/Sets.kt", SetsKt::main);
    }

    @Test
    public void testRemoveDuplicates() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Sets/Examples/src/RemoveDuplicates.kt", RemoveDuplicatesKt::main);
    }

    @Test
    public void testMutableSet() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Sets/Examples/src/MutableSet.kt", MutableSetKt::main);
    }

    @Test
    public void testMaps() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Maps/Examples/src/Maps.kt", MapsKt::main);
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
    public void testGetValue() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Maps/Examples/src/GetValue.kt", GetValueKt::main);
    }

    @Test
    public void testContactMap() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Maps/Examples/src/ContactMap.kt", ContactMapKt::main);
    }

    @Test
    public void testData() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Property Accessors/Examples/src/Data.kt", propertyaccessors.DataKt::main);
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
    public void testHamsters() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Property Accessors/Examples/src/Hamsters.kt", propertyaccessors.HamstersKt::main);
    }

    @Test
    public void testUseALibrary() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/UseALibrary.kt", UseALibraryKt::main);
    }

    @Test
    public void testUsingAtomicTest() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/UsingAtomicTest.kt", UsingAtomicTestKt::main);
    }

    @Test
    public void testListCollection() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/ListCollection.kt", ListCollectionKt::main);
    }

    @Test
    public void testClassBodies() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/ClassBodies.kt", ClassBodiesKt::main);
    }

    @Test
    public void testTemperature() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/Temperature.kt", TemperatureKt::main);
    }

    @Test
    public void testTicTacToe() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/TicTacToe.kt", TicTacToeKt::main);
    }

    @Test
    public void testWildAnimals() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/WildAnimals.kt", WildAnimalsKt::main);
    }

    @Test
    public void testBoxes() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/Boxes.kt", BoxesKt::main);
    }

    @Test
    public void testJetPack() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/JetPack.kt", JetPackKt::main);
    }

    @Test
    public void testToDoubleException() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/ToDoubleException.kt", ToDoubleExceptionKt::main);
    }

    @Test
    public void testAtomicTestCapture() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/AtomicTestCapture.kt", AtomicTestCaptureKt::main);
    }

    @Test
    public void testQuadratic() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/Quadratic.kt", QuadraticKt::main);
    }

    @Test
    public void testMutableVsReadonlyList() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/MutableVsReadonlyList.kt", MutableVsReadonlyListKt::main);
    }

    @Test
    public void testMultipleListReferences() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/MultipleListReferences.kt", MultipleListReferencesKt::main);
    }

    @Test
    public void testListOfStrings() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/ListOfStrings.kt", ListOfStringsKt::main);
    }

    @Test
    public void testExplicitTyping() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/ExplicitTyping.kt", ExplicitTypingKt::main);
    }

    @Test
    public void testVarArgs() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/VarArgs.kt", VarArgsKt::main);
    }

    @Test
    public void testArraySpread() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/ArraySpread.kt", ArraySpreadKt::main);
    }

    @Test
    public void testColorSet() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/ColorSet.kt", ColorSetKt::main);
    }

    @Test
    public void testASCIIMap() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/ASCIIMap.kt", ASCIIMapKt::main);
    }

    @Test
    public void testPropertyReadWrite() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/PropertyReadWrite.kt", summary2.PropertyReadWriteKt::main);
    }

    @Test
    public void testGettersAndSetter() {
        testExample("../AtomicKotlinCourse/Introduction to Objects/Summary 2/Examples/src/GettersAndSetter.kt", summary2.GettersAndSetterKt::main);
    }

    @Test
    public void testForControl() {
        testExample("../AtomicKotlinCourse/Usability/break & continue/Examples/src/ForControl.kt", ForControlKt::main);
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
    public void testForLabeled() {
        testExample("../AtomicKotlinCourse/Usability/break & continue/Examples/src/ForLabeled.kt", ForLabeledKt::main);
    }

    @Test
    public void testWhileLabeled() {
        testExample("../AtomicKotlinCourse/Usability/break & continue/Examples/src/WhileLabeled.kt", WhileLabeledKt::main);
    }

    @Test
    public void testDoLabeled() {
        testExample("../AtomicKotlinCourse/Usability/break & continue/Examples/src/DoLabeled.kt", DoLabeledKt::main);
    }

    @Test
    public void testQuoting() {
        testExample("../AtomicKotlinCourse/Usability/Extension Functions/Examples/src/Quoting.kt", quoting.QuotingKt::main);
    }

    @Test
    public void testQuote() {
        testExample("../AtomicKotlinCourse/Usability/Extension Functions/Examples/src/Quote.kt", other.QuoteKt::main);
    }

    @Test
    public void testStrangeQuote() {
        testExample("../AtomicKotlinCourse/Usability/Extension Functions/Examples/src/StrangeQuote.kt", StrangeQuoteKt::main);
    }

    @Test
    public void testBookExtensions() {
        testExample("../AtomicKotlinCourse/Usability/Extension Functions/Examples/src/BookExtensions.kt", BookExtensionsKt::main);
    }

    @Test
    public void testNamedArguments() {
        testExample("../AtomicKotlinCourse/Usability/Named & Default Arguments/Examples/src/NamedArguments.kt", color1.NamedArgumentsKt::main);
    }

    @Test
    public void testArgumentOrder() {
        testExample("../AtomicKotlinCourse/Usability/Named & Default Arguments/Examples/src/ArgumentOrder.kt", color1.ArgumentOrderKt::main);
    }

    @Test
    public void testColor2() {
        testExample("../AtomicKotlinCourse/Usability/Named & Default Arguments/Examples/src/Color2.kt", color2.Color2Kt::main);
    }

    @Test
    public void testColor3() {
        testExample("../AtomicKotlinCourse/Usability/Named & Default Arguments/Examples/src/Color3.kt", color3.Color3Kt::main);
    }

    @Test
    public void testCreateString() {
        testExample("../AtomicKotlinCourse/Usability/Named & Default Arguments/Examples/src/CreateString.kt", CreateStringKt::main);
    }

    @Test
    public void testEvaluation() {
        testExample("../AtomicKotlinCourse/Usability/Named & Default Arguments/Examples/src/Evaluation.kt", EvaluationKt::main);
    }

    @Test
    public void testCreateString2() {
        testExample("../AtomicKotlinCourse/Usability/Named & Default Arguments/Examples/src/CreateString2.kt", CreateString2Kt::main);
    }

    @Test
    public void testTrimMargin() {
        testExample("../AtomicKotlinCourse/Usability/Named & Default Arguments/Examples/src/TrimMargin.kt", TrimMarginKt::main);
    }

    @Test
    public void testOverloading() {
        testExample("../AtomicKotlinCourse/Usability/Overloading/Examples/src/Overloading.kt", OverloadingKt::main);
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
    public void testWithDefaultArguments() {
        testExample("../AtomicKotlinCourse/Usability/Overloading/Examples/src/WithDefaultArguments.kt", withdefaultarguments.WithDefaultArgumentsKt::main);
    }

    @Test
    public void testOverloadedVsDefaultArg() {
        testExample("../AtomicKotlinCourse/Usability/Overloading/Examples/src/OverloadedVsDefaultArg.kt", overloadingvsdefaultargs.OverloadedVsDefaultArgKt::main);
    }

    @Test
    public void testOverloadingAdd() {
        testExample("../AtomicKotlinCourse/Usability/Overloading/Examples/src/OverloadingAdd.kt", OverloadingAddKt::main);
    }

    @Test
    public void testGermanOrdinals() {
        testExample("../AtomicKotlinCourse/Usability/when Expressions/Examples/src/GermanOrdinals.kt", GermanOrdinalsKt::main);
    }

    @Test
    public void testAnalyzingInput() {
        testExample("../AtomicKotlinCourse/Usability/when Expressions/Examples/src/AnalyzingInput.kt", AnalyzingInputKt::main);
    }

    @Test
    public void testMatchingAgainstVals() {
        testExample("../AtomicKotlinCourse/Usability/when Expressions/Examples/src/MatchingAgainstVals.kt", MatchingAgainstValsKt::main);
    }

    @Test
    public void testMixColors() {
        testExample("../AtomicKotlinCourse/Usability/when Expressions/Examples/src/MixColors.kt", MixColorsKt::main);
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
    public void testCheckingOptions() {
        testExample("../AtomicKotlinCourse/Usability/Enumerations/Examples/src/CheckingOptions.kt", CheckingOptionsKt::main);
    }

    @Test
    public void testDirection() {
        testExample("../AtomicKotlinCourse/Usability/Enumerations/Examples/src/Direction.kt", enumerations.DirectionKt::main);
    }

    @Test
    public void testSimple() {
        testExample("../AtomicKotlinCourse/Usability/Data Classes/Examples/src/Simple.kt", SimpleKt::main);
    }

    @Test
    public void testDataClasses() {
        testExample("../AtomicKotlinCourse/Usability/Data Classes/Examples/src/DataClasses.kt", dataclasses.DataClassesKt::main);
    }

    @Test
    public void testCopyDataClass() {
        testExample("../AtomicKotlinCourse/Usability/Data Classes/Examples/src/CopyDataClass.kt", CopyDataClassKt::main);
    }

    @Test
    public void testNullInMaps() {
        testExample("../AtomicKotlinCourse/Usability/Nullable Types/Examples/src/NullInMaps.kt", NullInMapsKt::main);
    }

    @Test
    public void testNullableTypes() {
        testExample("../AtomicKotlinCourse/Usability/Nullable Types/Examples/src/NullableTypes.kt", NullableTypesKt::main);
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
    public void testExplicitCheck() {
        testExample("../AtomicKotlinCourse/Usability/Nullable Types/Examples/src/ExplicitCheck.kt", ExplicitCheckKt::main);
    }

    @Test
    public void testAmphibian() {
        testExample("../AtomicKotlinCourse/Usability/Nullable Types/Examples/src/Amphibian.kt", AmphibianKt::main);
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
    public void testSafeCall() {
        testExample("../AtomicKotlinCourse/Usability/Safe Calls & the Elvis Operator/Examples/src/SafeCall.kt", safecalls.SafeCallKt::main);
    }

    @Test
    public void testElvisOperator() {
        testExample("../AtomicKotlinCourse/Usability/Safe Calls & the Elvis Operator/Examples/src/ElvisOperator.kt", ElvisOperatorKt::main);
    }

    @Test
    public void testElvisCall() {
        testExample("../AtomicKotlinCourse/Usability/Safe Calls & the Elvis Operator/Examples/src/ElvisCall.kt", elvisoperator.ElvisCallKt::main);
    }

    @Test
    public void testChainedCalls() {
        testExample("../AtomicKotlinCourse/Usability/Safe Calls & the Elvis Operator/Examples/src/ChainedCalls.kt", safecalls.ChainedCallsKt::main);
    }

    @Test
    public void testNonNullAssert() {
        testExample("../AtomicKotlinCourse/Usability/Non-null Assertions/Examples/src/NonNullAssert.kt", NonNullAssertKt::main);
    }

    @Test
    public void testNonNullAssertCall() {
        testExample("../AtomicKotlinCourse/Usability/Non-null Assertions/Examples/src/NonNullAssertCall.kt", NonNullAssertCallKt::main);
    }

    @Test
    public void testValueFromMap() {
        testExample("../AtomicKotlinCourse/Usability/Non-null Assertions/Examples/src/ValueFromMap.kt", ValueFromMapKt::main);
    }

    @Test
    public void testStringIsNullOr() {
        testExample("../AtomicKotlinCourse/Usability/Extensions for Nullable Types/Examples/src/StringIsNullOr.kt", StringIsNullOrKt::main);
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
    public void testRigidHolder() {
        testExample("../AtomicKotlinCourse/Usability/Introduction to Generics/Examples/src/RigidHolder.kt", introgenerics.RigidHolderKt::main);
    }

    @Test
    public void testGenericHolder() {
        testExample("../AtomicKotlinCourse/Usability/Introduction to Generics/Examples/src/GenericHolder.kt", introgenerics.GenericHolderKt::main);
    }

    @Test
    public void testAnyInstead() {
        testExample("../AtomicKotlinCourse/Usability/Introduction to Generics/Examples/src/AnyInstead.kt", introgenerics.AnyInsteadKt::main);
    }

    @Test
    public void testGenericFunction() {
        testExample("../AtomicKotlinCourse/Usability/Introduction to Generics/Examples/src/GenericFunction.kt", introgenerics.GenericFunctionKt::main);
    }

    @Test
    public void testGenericListExtensions() {
        testExample("../AtomicKotlinCourse/Usability/Introduction to Generics/Examples/src/GenericListExtensions.kt", introgenerics.GenericListExtensionsKt::main);
    }

    @Test
    public void testStringIndices() {
        testExample("../AtomicKotlinCourse/Usability/Extension Properties/Examples/src/StringIndices.kt", extensionproperties.StringIndicesKt::main);
    }

    @Test
    public void testGenericListExt() {
        testExample("../AtomicKotlinCourse/Usability/Extension Properties/Examples/src/GenericListExt.kt", extensionproperties.GenericListExtKt::main);
    }

    @Test
    public void testListOfStar() {
        testExample("../AtomicKotlinCourse/Usability/Extension Properties/Examples/src/ListOfStar.kt", extensionproperties.ListOfStarKt::main);
    }

    @Test
    public void testAnyFromListOfStar() {
        testExample("../AtomicKotlinCourse/Usability/Extension Properties/Examples/src/AnyFromListOfStar.kt", extensionproperties.AnyFromListOfStarKt::main);
    }

    @Test
    public void testBasicLambda() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambdas/Examples/src/BasicLambda.kt", BasicLambdaKt::main);
    }

    @Test
    public void testLambdaTypeInference() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambdas/Examples/src/LambdaTypeInference.kt", LambdaTypeInferenceKt::main);
    }

    @Test
    public void testLambdaIt() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambdas/Examples/src/LambdaIt.kt", LambdaItKt::main);
    }

    @Test
    public void testMapping() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambdas/Examples/src/Mapping.kt", MappingKt::main);
    }

    @Test
    public void testOmittingParentheses() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambdas/Examples/src/OmittingParentheses.kt", OmittingParenthesesKt::main);
    }

    @Test
    public void testJoinToString() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambdas/Examples/src/JoinToString.kt", JoinToStringKt::main);
    }

    @Test
    public void testLambdaAndNamedArgs() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambdas/Examples/src/LambdaAndNamedArgs.kt", LambdaAndNamedArgsKt::main);
    }

    @Test
    public void testTwoArgLambda() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambdas/Examples/src/TwoArgLambda.kt", TwoArgLambdaKt::main);
    }

    @Test
    public void testUnderscore() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambdas/Examples/src/Underscore.kt", UnderscoreKt::main);
    }

    @Test
    public void testListIndicesMap() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambdas/Examples/src/ListIndicesMap.kt", ListIndicesMapKt::main);
    }

    @Test
    public void testZeroArguments() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambdas/Examples/src/ZeroArguments.kt", ZeroArgumentsKt::main);
    }

    @Test
    public void testFilterEven() {
        testExample("../AtomicKotlinCourse/Functional Programming/The Importance of Lambdas/Examples/src/FilterEven.kt", FilterEvenKt::main);
    }

    @Test
    public void testGreaterThan2() {
        testExample("../AtomicKotlinCourse/Functional Programming/The Importance of Lambdas/Examples/src/GreaterThan2.kt", GreaterThan2Kt::main);
    }

    @Test
    public void testFilter() {
        testExample("../AtomicKotlinCourse/Functional Programming/The Importance of Lambdas/Examples/src/Filter.kt", FilterKt::main);
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
    public void testClosures2() {
        testExample("../AtomicKotlinCourse/Functional Programming/The Importance of Lambdas/Examples/src/Closures2.kt", Closures2Kt::main);
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
    public void testCreatingLists() {
        testExample("../AtomicKotlinCourse/Functional Programming/Operations on Collections/Examples/src/CreatingLists.kt", CreatingListsKt::main);
    }

    @Test
    public void testListInit() {
        testExample("../AtomicKotlinCourse/Functional Programming/Operations on Collections/Examples/src/ListInit.kt", ListInitKt::main);
    }

    @Test
    public void testPredicates() {
        testExample("../AtomicKotlinCourse/Functional Programming/Operations on Collections/Examples/src/Predicates.kt", PredicatesKt::main);
    }

    @Test
    public void testPartition() {
        testExample("../AtomicKotlinCourse/Functional Programming/Operations on Collections/Examples/src/Partition.kt", PartitionKt::main);
    }

    @Test
    public void testPairOfLists() {
        testExample("../AtomicKotlinCourse/Functional Programming/Operations on Collections/Examples/src/PairOfLists.kt", PairOfListsKt::main);
    }

    @Test
    public void testFilterNotNull() {
        testExample("../AtomicKotlinCourse/Functional Programming/Operations on Collections/Examples/src/FilterNotNull.kt", FilterNotNullKt::main);
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
    public void testOperationsOnSets() {
        testExample("../AtomicKotlinCourse/Functional Programming/Operations on Collections/Examples/src/OperationsOnSets.kt", OperationsOnSetsKt::main);
    }

    @Test
    public void testPropertyReference() {
        testExample("../AtomicKotlinCourse/Functional Programming/Member References/Examples/src/PropertyReference.kt", memberreferences1.PropertyReferenceKt::main);
    }

    @Test
    public void testSortWith() {
        testExample("../AtomicKotlinCourse/Functional Programming/Member References/Examples/src/SortWith.kt", memberreferences1.SortWithKt::main);
    }

    @Test
    public void testFunctionReference() {
        testExample("../AtomicKotlinCourse/Functional Programming/Member References/Examples/src/FunctionReference.kt", memberreferences2.FunctionReferenceKt::main);
    }

    @Test
    public void testTopLevelFunctionRef() {
        testExample("../AtomicKotlinCourse/Functional Programming/Member References/Examples/src/TopLevelFunctionRef.kt", memberreferences2.TopLevelFunctionRefKt::main);
    }

    @Test
    public void testConstructorReference() {
        testExample("../AtomicKotlinCourse/Functional Programming/Member References/Examples/src/ConstructorReference.kt", memberreferences3.ConstructorReferenceKt::main);
    }

    @Test
    public void testSimpleOperation() {
        testExample("../AtomicKotlinCourse/Functional Programming/Function Types/Examples/src/SimpleOperation.kt", SimpleOperationKt::main);
    }

    @Test
    public void testFunctionTypeExamples() {
        testExample("../AtomicKotlinCourse/Functional Programming/Function Types/Examples/src/FunctionTypeExamples.kt", FunctionTypeExamplesKt::main);
    }

    @Test
    public void testAnyFunImplementation() {
        testExample("../AtomicKotlinCourse/Functional Programming/Function Types/Examples/src/AnyFunImplementation.kt", AnyFunImplementationKt::main);
    }

    @Test
    public void testRepeatByInt() {
        testExample("../AtomicKotlinCourse/Functional Programming/Function Types/Examples/src/RepeatByInt.kt", RepeatByIntKt::main);
    }

    @Test
    public void testRepeatVerbose() {
        testExample("../AtomicKotlinCourse/Functional Programming/Function Types/Examples/src/RepeatVerbose.kt", RepeatVerboseKt::main);
    }

    @Test
    public void testDefiningRepeat() {
        testExample("../AtomicKotlinCourse/Functional Programming/Function Types/Examples/src/DefiningRepeat.kt", definingrepeat.DefiningRepeatKt::main);
    }

    @Test
    public void testNullableReturnType() {
        testExample("../AtomicKotlinCourse/Functional Programming/Function Types/Examples/src/NullableReturnType.kt", NullableReturnTypeKt::main);
    }

    @Test
    public void testNullableFunctionType() {
        testExample("../AtomicKotlinCourse/Functional Programming/Function Types/Examples/src/NullableFunctionType.kt", NullableFunctionTypeKt::main);
    }

    @Test
    public void testZipper() {
        testExample("../AtomicKotlinCourse/Functional Programming/Manipulating Lists/Examples/src/Zipper.kt", ZipperKt::main);
    }

    @Test
    public void testZipAndTransform() {
        testExample("../AtomicKotlinCourse/Functional Programming/Manipulating Lists/Examples/src/ZipAndTransform.kt", manipulatinglists.ZipAndTransformKt::main);
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
    public void testWhyFlatMap() {
        testExample("../AtomicKotlinCourse/Functional Programming/Manipulating Lists/Examples/src/WhyFlatMap.kt", manipulatinglists.WhyFlatMapKt::main);
    }

    @Test
    public void testGroupBy() {
        testExample("../AtomicKotlinCourse/Functional Programming/From Lists to Maps/Examples/src/GroupBy.kt", GroupByKt::main);
    }

    @Test
    public void testGroupByVsFilter() {
        testExample("../AtomicKotlinCourse/Functional Programming/From Lists to Maps/Examples/src/GroupByVsFilter.kt", GroupByVsFilterKt::main);
    }

    @Test
    public void testAssociateBy() {
        testExample("../AtomicKotlinCourse/Functional Programming/From Lists to Maps/Examples/src/AssociateBy.kt", AssociateByKt::main);
    }

    @Test
    public void testGetOrPut() {
        testExample("../AtomicKotlinCourse/Functional Programming/From Lists to Maps/Examples/src/GetOrPut.kt", GetOrPutKt::main);
    }

    @Test
    public void testFilteringMap() {
        testExample("../AtomicKotlinCourse/Functional Programming/From Lists to Maps/Examples/src/FilteringMap.kt", FilteringMapKt::main);
    }

    @Test
    public void testTransformingMap() {
        testExample("../AtomicKotlinCourse/Functional Programming/From Lists to Maps/Examples/src/TransformingMap.kt", TransformingMapKt::main);
    }

    @Test
    public void testSimilarOperation() {
        testExample("../AtomicKotlinCourse/Functional Programming/From Lists to Maps/Examples/src/SimilarOperation.kt", SimilarOperationKt::main);
    }

    @Test
    public void testStringBuilder() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambda with Receiver/Examples/src/StringBuilder.kt", StringBuilderKt::main);
    }

    @Test
    public void testRegularLambda() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambda with Receiver/Examples/src/RegularLambda.kt", regularlambda.RegularLambdaKt::main);
    }

    @Test
    public void testBuildString() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambda with Receiver/Examples/src/BuildString.kt", BuildStringKt::main);
    }

    @Test
    public void testBuildStringAndThis() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambda with Receiver/Examples/src/BuildStringAndThis.kt", BuildStringAndThisKt::main);
    }

    @Test
    public void testDeclarations() {
        testExample("../AtomicKotlinCourse/Functional Programming/Lambda with Receiver/Examples/src/Declarations.kt", lambdawithreceiver.DeclarationsKt::main);
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
    public void testNullableReceiver() {
        testExample("../AtomicKotlinCourse/Functional Programming/Library Helpers/Examples/src/NullableReceiver.kt", libraryhelpers.NullableReceiverKt::main);
    }

    @Test
    public void testResultOfWith() {
        testExample("../AtomicKotlinCourse/Functional Programming/Library Helpers/Examples/src/ResultOfWith.kt", libraryhelpers.ResultOfWithKt::main);
    }

    @Test
    public void testResultOfApply() {
        testExample("../AtomicKotlinCourse/Functional Programming/Library Helpers/Examples/src/ResultOfApply.kt", libraryhelpers.ResultOfApplyKt::main);
    }

    @Test
    public void testApplyIfNotNull() {
        testExample("../AtomicKotlinCourse/Functional Programming/Library Helpers/Examples/src/ApplyIfNotNull.kt", libraryhelpers.ApplyIfNotNullKt::main);
    }

    @Test
    public void testAlso() {
        testExample("../AtomicKotlinCourse/Functional Programming/Library Helpers/Examples/src/Also.kt", libraryhelpers.AlsoKt::main);
    }

    @Test
    public void testApplyVsAlso() {
        testExample("../AtomicKotlinCourse/Functional Programming/Library Helpers/Examples/src/ApplyVsAlso.kt", libraryhelpers.ApplyVsAlsoKt::main);
    }

    @Test
    public void testCheckingArgument() {
        testExample("../AtomicKotlinCourse/Functional Programming/Library Helpers/Examples/src/CheckingArgument.kt", libraryhelpers.CheckingArgumentKt::main);
    }

    @Test
    public void testLet() {
        testExample("../AtomicKotlinCourse/Functional Programming/Library Helpers/Examples/src/Let.kt", libraryhelpers.LetKt::main);
    }

    @Test
    public void testEagerEvaluation() {
        testExample("../AtomicKotlinCourse/Functional Programming/Sequences/Examples/src/EagerEvaluation.kt", EagerEvaluationKt::main);
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
    public void testNumberSequence1() {
        testExample("../AtomicKotlinCourse/Functional Programming/More Library Functions/Examples/src/NumberSequence1.kt", NumberSequence1Kt::main);
    }

    @Test
    public void testInputLines1() {
        testExample("../AtomicKotlinCourse/Functional Programming/More Library Functions/Examples/src/InputLines1.kt", InputLines1Kt::main);
    }

    @Test
    public void testInputLines2() {
        testExample("../AtomicKotlinCourse/Functional Programming/More Library Functions/Examples/src/InputLines2.kt", InputLines2Kt::main);
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
    public void testReadingNameWithIf() {
        testExample("../AtomicKotlinCourse/Functional Programming/More Library Functions/Examples/src/ReadingNameWithIf.kt", ReadingNameWithIfKt::main);
    }

    @Test
    public void testLocalFunctions() {
        testExample("../AtomicKotlinCourse/Functional Programming/Functions Inside Functions/Examples/src/LocalFunctions.kt", LocalFunctionsKt::main);
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
    public void testInterestingSessions() {
        testExample("../AtomicKotlinCourse/Functional Programming/Functions Inside Functions/Examples/src/InterestingSessions.kt", localfunctions.InterestingSessionsKt::main);
    }

    @Test
    public void testReturnFromFun() {
        testExample("../AtomicKotlinCourse/Functional Programming/Functions Inside Functions/Examples/src/ReturnFromFun.kt", ReturnFromFunKt::main);
    }

    @Test
    public void testLabeledReturn() {
        testExample("../AtomicKotlinCourse/Functional Programming/Functions Inside Functions/Examples/src/LabeledReturn.kt", LabeledReturnKt::main);
    }

    @Test
    public void testCustomLabel() {
        testExample("../AtomicKotlinCourse/Functional Programming/Functions Inside Functions/Examples/src/CustomLabel.kt", CustomLabelKt::main);
    }

    @Test
    public void testReturnInsideLambda() {
        testExample("../AtomicKotlinCourse/Functional Programming/Functions Inside Functions/Examples/src/ReturnInsideLambda.kt", localfunctions.ReturnInsideLambdaKt::main);
    }

    @Test
    public void testHelperFunction() {
        testExample("../AtomicKotlinCourse/Functional Programming/Functions Inside Functions/Examples/src/HelperFunction.kt", localfunctions.HelperFunctionKt::main);
    }

    @Test
    public void testSumViaFold() {
        testExample("../AtomicKotlinCourse/Functional Programming/Folding Lists/Examples/src/SumViaFold.kt", SumViaFoldKt::main);
    }

    @Test
    public void testFoldVsForLoop() {
        testExample("../AtomicKotlinCourse/Functional Programming/Folding Lists/Examples/src/FoldVsForLoop.kt", FoldVsForLoopKt::main);
    }

    @Test
    public void testFoldRight() {
        testExample("../AtomicKotlinCourse/Functional Programming/Folding Lists/Examples/src/FoldRight.kt", FoldRightKt::main);
    }

    @Test
    public void testFoldAndReduce() {
        testExample("../AtomicKotlinCourse/Functional Programming/Folding Lists/Examples/src/FoldAndReduce.kt", FoldAndReduceKt::main);
    }

    @Test
    public void testFactorial() {
        testExample("../AtomicKotlinCourse/Functional Programming/Recursion/Examples/src/Factorial.kt", recursion.FactorialKt::main);
    }

    @Test
    public void testCallStack() {
        testExample("../AtomicKotlinCourse/Functional Programming/Recursion/Examples/src/CallStack.kt", recursion.CallStackKt::main);
    }

    @Test
    public void testInfiniteRecursion() {
        testExample("../AtomicKotlinCourse/Functional Programming/Recursion/Examples/src/InfiniteRecursion.kt", recursion.InfiniteRecursionKt::main);
    }

    @Test
    public void testRecursionLimits() {
        testExample("../AtomicKotlinCourse/Functional Programming/Recursion/Examples/src/RecursionLimits.kt", recursion.RecursionLimitsKt::main);
    }

    @Test
    public void testIteration() {
        testExample("../AtomicKotlinCourse/Functional Programming/Recursion/Examples/src/Iteration.kt", iteration.IterationKt::main);
    }

    @Test
    public void testTailRecursiveSum() {
        testExample("../AtomicKotlinCourse/Functional Programming/Recursion/Examples/src/TailRecursiveSum.kt", tailrecursion.TailRecursiveSumKt::main);
    }

    @Test
    public void testVerySlowFibonacci() {
        testExample("../AtomicKotlinCourse/Functional Programming/Recursion/Examples/src/VerySlowFibonacci.kt", slowfibonacci.VerySlowFibonacciKt::main);
    }

    @Test
    public void testFibonacci() {
        testExample("../AtomicKotlinCourse/Functional Programming/Recursion/Examples/src/Fibonacci.kt", recursion.FibonacciKt::main);
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
    public void testBear() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Complex Constructors/Examples/src/Bear.kt", complexconstructors.BearKt::main);
    }

    @Test
    public void testSimpleConstructor() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Complex Constructors/Examples/src/SimpleConstructor.kt", complexconstructors.SimpleConstructorKt::main);
    }

    @Test
    public void testInitSection() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Complex Constructors/Examples/src/InitSection.kt", complexconstructors.InitSectionKt::main);
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
    public void testHouse() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Base Class Initialization/Examples/src/House.kt", baseclassinit.HouseKt::main);
    }

    @Test
    public void testOtherConstructors() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Base Class Initialization/Examples/src/OtherConstructors.kt", baseclassinit.OtherConstructorsKt::main);
    }

    @Test
    public void testStateOfAClass() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Abstract Classes/Examples/src/StateOfAClass.kt", abstractstate.StateOfAClassKt::main);
    }

    @Test
    public void testInterfaceCollision() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Abstract Classes/Examples/src/InterfaceCollision.kt", collision.InterfaceCollisionKt::main);
    }

    @Test
    public void testGadget() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Abstract Classes/Examples/src/Gadget.kt", GadgetKt::main);
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
    public void testDessert2() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Polymorphism/Examples/src/Dessert2.kt", polymorphism.Dessert2Kt::main);
    }

    @Test
    public void testDowncasting() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Polymorphism/Examples/src/Downcasting.kt", polymorphism.DowncastingKt::main);
    }

    @Test
    public void testHumanAlice() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Casting/Examples/src/HumanAlice.kt", casting.HumanAliceKt::main);
    }

    @Test
    public void testSmartCast() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Casting/Examples/src/SmartCast.kt", casting.SmartCastKt::main);
    }

    @Test
    public void testWhenAndCasting() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Casting/Examples/src/WhenAndCasting.kt", casting.WhenAndCastingKt::main);
    }

    @Test
    public void testUnsafe() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Casting/Examples/src/Unsafe.kt", casting.UnsafeKt::main);
    }

    @Test
    public void testSafe() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Casting/Examples/src/Safe.kt", casting.SafeKt::main);
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
    public void testObjectKeyword() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Objects/Examples/src/ObjectKeyword.kt", ObjectKeywordKt::main);
    }

    @Test
    public void testObjectInheritance() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Objects/Examples/src/ObjectInheritance.kt", ObjectInheritanceKt::main);
    }

    @Test
    public void testObjectNesting() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Objects/Examples/src/ObjectNesting.kt", ObjectNestingKt::main);
    }

    @Test
    public void testCompanionObject() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Companion Objects/Examples/src/CompanionObject.kt", CompanionObjectKt::main);
    }

    @Test
    public void testNamedCompanionObject() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Companion Objects/Examples/src/NamedCompanionObject.kt", NamedCompanionObjectKt::main);
    }

    @Test
    public void testObjectProperty() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Companion Objects/Examples/src/ObjectProperty.kt", ObjectPropertyKt::main);
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
    public void testExplicitDelegation() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Class Delegation/Examples/src/ExplicitDelegation.kt", ExplicitDelegationKt::main);
    }

    @Test
    public void testDelegatedControls() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Class Delegation/Examples/src/DelegatedControls.kt", DelegatedControlsKt::main);
    }

    @Test
    public void testModelingMI() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Class Delegation/Examples/src/ModelingMI.kt", ModelingMIKt::main);
    }

    @Test
    public void testLabeledThis() {
        testExample("../AtomicKotlinCourse/Object-Oriented Programming/Inner & Nested Classes/Examples/src/LabeledThis.kt", labeledthis.LabeledThisKt::main);
    }
}