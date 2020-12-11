import org.junit.Test;

public class TestAllExamples extends AbstractTestExamples {
    @Test
    public void testEmptyProgram() {
        testExample("Programming Basics/Hello, World/Examples/src/EmptyProgram.kt", EmptyProgramKt::main);
    }

    @Test
    public void testHelloWorld() {
        testExample("Programming Basics/Hello, World/Examples/src/HelloWorld.kt", HelloWorldKt::main);
    }

    @Test
    public void testVals() {
        testExample("Programming Basics/var & val/Examples/src/Vals.kt", ValsKt::main);
    }

    @Test
    public void testVars() {
        testExample("Programming Basics/var & val/Examples/src/Vars.kt", VarsKt::main);
    }

    @Test
    public void testAVarIsMutable() {
        testExample("Programming Basics/var & val/Examples/src/AVarIsMutable.kt", AVarIsMutableKt::main);
    }

    @Test
    public void testInference() {
        testExample("Programming Basics/Data Types/Examples/src/Inference.kt", InferenceKt::main);
    }

    @Test
    public void testStringPlusNumber() {
        testExample("Programming Basics/Data Types/Examples/src/StringPlusNumber.kt", StringPlusNumberKt::main);
    }

    @Test
    public void testTypes() {
        testExample("Programming Basics/Data Types/Examples/src/Types.kt", TypesKt::main);
    }

    @Test
    public void testSayHello() {
        testExample("Programming Basics/Functions/Examples/src/SayHello.kt", SayHelloKt::main);
    }

    @Test
    public void testMultiplyByThree() {
        testExample("Programming Basics/Functions/Examples/src/MultiplyByThree.kt", MultiplyByThreeKt::main);
    }

    @Test
    public void testMultiplyByTwo() {
        testExample("Programming Basics/Functions/Examples/src/MultiplyByTwo.kt", MultiplyByTwoKt::main);
    }

    @Test
    public void testMultiplyByFour() {
        testExample("Programming Basics/Functions/Examples/src/MultiplyByFour.kt", MultiplyByFourKt::main);
    }

    @Test
    public void testIf3() {
        testExample("Programming Basics/if Expressions/Examples/src/If3.kt", If3Kt::main);
    }

    @Test
    public void testIf2() {
        testExample("Programming Basics/if Expressions/Examples/src/If2.kt", If2Kt::main);
    }

    @Test
    public void testIf6() {
        testExample("Programming Basics/if Expressions/Examples/src/If6.kt", If6Kt::main);
    }

    @Test
    public void testOneOrTheOther() {
        testExample("Programming Basics/if Expressions/Examples/src/OneOrTheOther.kt", OneOrTheOtherKt::main);
    }

    @Test
    public void testTrueOrFalse() {
        testExample("Programming Basics/if Expressions/Examples/src/TrueOrFalse.kt", TrueOrFalseKt::main);
    }

    @Test
    public void testIf1() {
        testExample("Programming Basics/if Expressions/Examples/src/If1.kt", If1Kt::main);
    }

    @Test
    public void testIf5() {
        testExample("Programming Basics/if Expressions/Examples/src/If5.kt", If5Kt::main);
    }

    @Test
    public void testIf4() {
        testExample("Programming Basics/if Expressions/Examples/src/If4.kt", If4Kt::main);
    }

    @Test
    public void testStringTemplates() {
        testExample("Programming Basics/String Templates/Examples/src/StringTemplates.kt", StringTemplatesKt::main);
    }

    @Test
    public void testExpressionInTemplate() {
        testExample("Programming Basics/String Templates/Examples/src/ExpressionInTemplate.kt", ExpressionInTemplateKt::main);
    }

    @Test
    public void testStringConcatenation() {
        testExample("Programming Basics/String Templates/Examples/src/StringConcatenation.kt", StringConcatenationKt::main);
    }

    @Test
    public void testTripleQuotes() {
        testExample("Programming Basics/String Templates/Examples/src/TripleQuotes.kt", TripleQuotesKt::main);
    }

    @Test
    public void testIntegerOverflow() {
        testExample("Programming Basics/Number Types/Examples/src/IntegerOverflow.kt", IntegerOverflowKt::main);
    }

    @Test
    public void testBMIMetric() {
        testExample("Programming Basics/Number Types/Examples/src/BMIMetric.kt", BMIMetricKt::main);
    }

    @Test
    public void testModulus() {
        testExample("Programming Basics/Number Types/Examples/src/Modulus.kt", ModulusKt::main);
    }

    @Test
    public void testUsingLongs() {
        testExample("Programming Basics/Number Types/Examples/src/UsingLongs.kt", UsingLongsKt::main);
    }

    @Test
    public void testIntDivisionTruncates() {
        testExample("Programming Basics/Number Types/Examples/src/IntDivisionTruncates.kt", IntDivisionTruncatesKt::main);
    }

    @Test
    public void testLongConstants() {
        testExample("Programming Basics/Number Types/Examples/src/LongConstants.kt", LongConstantsKt::main);
    }

    @Test
    public void testOpOrder() {
        testExample("Programming Basics/Number Types/Examples/src/OpOrder.kt", OpOrderKt::main);
    }

    @Test
    public void testInferInt() {
        testExample("Programming Basics/Number Types/Examples/src/InferInt.kt", InferIntKt::main);
    }

    @Test
    public void testBiggestLong() {
        testExample("Programming Basics/Number Types/Examples/src/BiggestLong.kt", BiggestLongKt::main);
    }

    @Test
    public void testBMIEnglish() {
        testExample("Programming Basics/Number Types/Examples/src/BMIEnglish.kt", BMIEnglishKt::main);
    }

    @Test
    public void testOpOrderParens() {
        testExample("Programming Basics/Number Types/Examples/src/OpOrderParens.kt", OpOrderParensKt::main);
    }

    @Test
    public void testClosed() {
        testExample("Programming Basics/Booleans/Examples/src/Closed.kt", ClosedKt::main);
    }

    @Test
    public void testOpen2() {
        testExample("Programming Basics/Booleans/Examples/src/Open2.kt", Open2Kt::main);
    }

    @Test
    public void testOpen1() {
        testExample("Programming Basics/Booleans/Examples/src/Open1.kt", Open1Kt::main);
    }

    @Test
    public void testEvaluationOrder() {
        testExample("Programming Basics/Booleans/Examples/src/EvaluationOrder.kt", EvaluationOrderKt::main);
    }

    @Test
    public void testDoWhileLoop() {
        testExample("Programming Basics/Repetition with while/Examples/src/DoWhileLoop.kt", DoWhileLoopKt::main);
    }

    @Test
    public void testIncrementOperator() {
        testExample("Programming Basics/Repetition with while/Examples/src/IncrementOperator.kt", IncrementOperatorKt::main);
    }

    @Test
    public void testWhileLoop() {
        testExample("Programming Basics/Repetition with while/Examples/src/WhileLoop.kt", WhileLoopKt::main);
    }

    @Test
    public void testAssignmentOperators() {
        testExample("Programming Basics/Repetition with while/Examples/src/AssignmentOperators.kt", AssignmentOperatorsKt::main);
    }

    @Test
    public void testDefiningRanges() {
        testExample("Programming Basics/Looping & Ranges/Examples/src/DefiningRanges.kt", DefiningRangesKt::main);
    }

    @Test
    public void testIterateOverString() {
        testExample("Programming Basics/Looping & Ranges/Examples/src/IterateOverString.kt", IterateOverStringKt::main);
    }

    @Test
    public void testForWithRanges() {
        testExample("Programming Basics/Looping & Ranges/Examples/src/ForWithRanges.kt", ForWithRangesKt::main);
    }

    @Test
    public void testSumUsingRange() {
        testExample("Programming Basics/Looping & Ranges/Examples/src/SumUsingRange.kt", SumUsingRangeKt::main);
    }

    @Test
    public void testRepeatThreeTimes() {
        testExample("Programming Basics/Looping & Ranges/Examples/src/RepeatThreeTimes.kt", RepeatThreeTimesKt::main);
    }

    @Test
    public void testRepeatHi() {
        testExample("Programming Basics/Looping & Ranges/Examples/src/RepeatHi.kt", RepeatHiKt::main);
    }

    @Test
    public void testAddingIntToChar() {
        testExample("Programming Basics/Looping & Ranges/Examples/src/AddingIntToChar.kt", AddingIntToCharKt::main);
    }

    @Test
    public void testForWithCharRange() {
        testExample("Programming Basics/Looping & Ranges/Examples/src/ForWithCharRange.kt", ForWithCharRangeKt::main);
    }

    @Test
    public void testHasChar() {
        testExample("Programming Basics/Looping & Ranges/Examples/src/HasChar.kt", HasCharKt::main);
    }

    @Test
    public void testIndexIntoString() {
        testExample("Programming Basics/Looping & Ranges/Examples/src/IndexIntoString.kt", IndexIntoStringKt::main);
    }

    @Test
    public void testInString() {
        testExample("Programming Basics/The in Keyword/Examples/src/InString.kt", InStringKt::main);
    }

    @Test
    public void testStringRange() {
        testExample("Programming Basics/The in Keyword/Examples/src/StringRange.kt", StringRangeKt::main);
    }

    @Test
    public void testCharRange() {
        testExample("Programming Basics/The in Keyword/Examples/src/CharRange.kt", CharRangeKt::main);
    }

    @Test
    public void testFloatingPointRange() {
        testExample("Programming Basics/The in Keyword/Examples/src/FloatingPointRange.kt", FloatingPointRangeKt::main);
    }

    @Test
    public void testMembershipInRange() {
        testExample("Programming Basics/The in Keyword/Examples/src/MembershipInRange.kt", MembershipInRangeKt::main);
    }

    @Test
    public void testMembershipUsingBounds() {
        testExample("Programming Basics/The in Keyword/Examples/src/MembershipUsingBounds.kt", MembershipUsingBoundsKt::main);
    }

    @Test
    public void testIterationVsMembership() {
        testExample("Programming Basics/The in Keyword/Examples/src/IterationVsMembership.kt", IterationVsMembershipKt::main);
    }

    @Test
    public void testForIsAStatement() {
        testExample("Programming Basics/Expressions & Statements/Examples/src/ForIsAStatement.kt", ForIsAStatementKt::main);
    }

    @Test
    public void testUnitReturnType() {
        testExample("Programming Basics/Expressions & Statements/Examples/src/UnitReturnType.kt", UnitReturnTypeKt::main);
    }

    @Test
    public void testPostfixVsPrefix() {
        testExample("Programming Basics/Expressions & Statements/Examples/src/PostfixVsPrefix.kt", PostfixVsPrefixKt::main);
    }

    @Test
    public void testAssigningAnIf() {
        testExample("Programming Basics/Expressions & Statements/Examples/src/AssigningAnIf.kt", AssigningAnIfKt::main);
    }

    @Test
    public void testConfusing() {
        testExample("Programming Basics/Expressions & Statements/Examples/src/Confusing.kt", ConfusingKt::main);
    }

    @Test
    public void testDoWhile() {
        testExample("Programming Basics/Summary 1/Examples/src/DoWhile.kt", DoWhileKt::main);
    }

    @Test
    public void testWhile() {
        testExample("Programming Basics/Summary 1/Examples/src/While.kt", WhileKt::main);
    }

    @Test
    public void testTruncation() {
        testExample("Programming Basics/Summary 1/Examples/src/Truncation.kt", TruncationKt::main);
    }

    @Test
    public void testUnitReturn() {
        testExample("Programming Basics/Summary 1/Examples/src/UnitReturn.kt", UnitReturnKt::main);
    }

    @Test
    public void testMembership() {
        testExample("Programming Basics/Summary 1/Examples/src/Membership.kt", MembershipKt::main);
    }

    @Test
    public void testIfExpression() {
        testExample("Programming Basics/Summary 1/Examples/src/IfExpression.kt", IfExpressionKt::main);
    }

    @Test
    public void testStringIteration() {
        testExample("Programming Basics/Summary 1/Examples/src/StringIteration.kt", StringIterationKt::main);
    }

    @Test
    public void testStrTemplates() {
        testExample("Programming Basics/Summary 1/Examples/src/StrTemplates.kt", StrTemplatesKt::main);
    }

    @Test
    public void testHello() {
        testExample("Programming Basics/Summary 1/Examples/src/Hello.kt", HelloKt::main);
    }

    @Test
    public void testBasicFunctions() {
        testExample("Programming Basics/Summary 1/Examples/src/BasicFunctions.kt", BasicFunctionsKt::main);
    }

    @Test
    public void testIfResult() {
        testExample("Programming Basics/Summary 1/Examples/src/IfResult.kt", IfResultKt::main);
    }

    @Test
    public void testRangeOfInt() {
        testExample("Programming Basics/Summary 1/Examples/src/RangeOfInt.kt", RangeOfIntKt::main);
    }

    @Test
    public void testThreeQuotes() {
        testExample("Programming Basics/Summary 1/Examples/src/ThreeQuotes.kt", ThreeQuotesKt::main);
    }

    @Test
    public void testNumberTypes() {
        testExample("Programming Basics/Summary 1/Examples/src/NumberTypes.kt", NumberTypesKt::main);
    }

    @Test
    public void testOverflow() {
        testExample("Programming Basics/Summary 1/Examples/src/Overflow.kt", OverflowKt::main);
    }

    @Test
    public void testBooleans() {
        testExample("Programming Basics/Summary 1/Examples/src/Booleans.kt", BooleansKt::main);
    }

    @Test
    public void testStrings() {
        testExample("Introduction to Objects/Objects Everywhere/Examples/src/Strings.kt", StringsKt::main);
    }

    @Test
    public void testNumberConversions() {
        testExample("Introduction to Objects/Objects Everywhere/Examples/src/NumberConversions.kt", NumberConversionsKt::main);
    }

    @Test
    public void testRangeSum() {
        testExample("Introduction to Objects/Objects Everywhere/Examples/src/RangeSum.kt", RangeSumKt::main);
    }

    @Test
    public void testIntRanges() {
        testExample("Introduction to Objects/Objects Everywhere/Examples/src/IntRanges.kt", IntRangesKt::main);
    }

    @Test
    public void testConversion() {
        testExample("Introduction to Objects/Objects Everywhere/Examples/src/Conversion.kt", ConversionKt::main);
    }

    @Test
    public void testAnimals() {
        testExample("Introduction to Objects/Creating Classes/Examples/src/Animals.kt", AnimalsKt::main);
    }

    @Test
    public void testDog() {
        testExample("Introduction to Objects/Creating Classes/Examples/src/Dog.kt", DogKt::main);
    }

    @Test
    public void testCat() {
        testExample("Introduction to Objects/Creating Classes/Examples/src/Cat.kt", CatKt::main);
    }

    @Test
    public void testHamster() {
        testExample("Introduction to Objects/Creating Classes/Examples/src/Hamster.kt", HamsterKt::main);
    }

    @Test
    public void testCup2() {
        testExample("Introduction to Objects/Properties/Examples/src/Cup2.kt", Cup2Kt::main);
    }

    @Test
    public void testAnUnchangingVar() {
        testExample("Introduction to Objects/Properties/Examples/src/AnUnchangingVar.kt", AnUnchangingVarKt::main);
    }

    @Test
    public void testReferences() {
        testExample("Introduction to Objects/Properties/Examples/src/References.kt", ReferencesKt::main);
    }

    @Test
    public void testCup() {
        testExample("Introduction to Objects/Properties/Examples/src/Cup.kt", CupKt::main);
    }

    @Test
    public void testChangingAVal() {
        testExample("Introduction to Objects/Properties/Examples/src/ChangingAVal.kt", ChangingAValKt::main);
    }

    @Test
    public void testScientist() {
        testExample("Introduction to Objects/Constructors/Examples/src/Scientist.kt", ScientistKt::main);
    }

    @Test
    public void testDisplayAlienSpecies() {
        testExample("Introduction to Objects/Constructors/Examples/src/DisplayAlienSpecies.kt", DisplayAlienSpeciesKt::main);
    }

    @Test
    public void testArg() {
        testExample("Introduction to Objects/Constructors/Examples/src/Arg.kt", ArgKt::main);
    }

    @Test
    public void testWombat() {
        testExample("Introduction to Objects/Constructors/Examples/src/Wombat.kt", WombatKt::main);
    }

    @Test
    public void testVisibleArgs() {
        testExample("Introduction to Objects/Constructors/Examples/src/VisibleArgs.kt", VisibleArgsKt::main);
    }

    @Test
    public void testMultipleArgs() {
        testExample("Introduction to Objects/Constructors/Examples/src/MultipleArgs.kt", MultipleArgsKt::main);
    }

    @Test
    public void testCookie() {
        testExample("Introduction to Objects/Constraining Visibility/Examples/src/Cookie.kt", CookieKt::main);
    }

    @Test
    public void testMultipleRef() {
        testExample("Introduction to Objects/Constraining Visibility/Examples/src/MultipleRef.kt", MultipleRefKt::main);
    }

    @Test
    public void testObserveAnimals() {
        testExample("Introduction to Objects/Constraining Visibility/Examples/src/ObserveAnimals.kt", ObserveAnimalsKt::main);
    }

    @Test
    public void testImportClass() {
        testExample("Introduction to Objects/Packages/Examples/src/ImportClass.kt", ImportClassKt::main);
    }

    @Test
    public void testImportNameChange() {
        testExample("Introduction to Objects/Packages/Examples/src/ImportNameChange.kt", ImportNameChangeKt::main);
    }

    @Test
    public void testImportEverything() {
        testExample("Introduction to Objects/Packages/Examples/src/ImportEverything.kt", ImportEverythingKt::main);
    }

    @Test
    public void testImportPythagorean() {
        testExample("Introduction to Objects/Packages/Examples/src/ImportPythagorean.kt", ImportPythagoreanKt::main);
    }

    @Test
    public void testFullyQualify() {
        testExample("Introduction to Objects/Packages/Examples/src/FullyQualify.kt", FullyQualifyKt::main);
    }

    @Test
    public void testTDDWorks() {
        testExample("Introduction to Objects/Testing/Examples/src/TDDWorks.kt", testing3.TDDWorksKt::main);
    }

    @Test
    public void testTDDStillFails() {
        testExample("Introduction to Objects/Testing/Examples/src/TDDStillFails.kt", testing2.TDDStillFailsKt::main);
    }

    @Test
    public void testTDDFail() {
        testExample("Introduction to Objects/Testing/Examples/src/TDDFail.kt", testing1.TDDFailKt::main);
    }

    @Test
    public void testTrace1() {
        testExample("Introduction to Objects/Testing/Examples/src/Trace1.kt", Trace1Kt::main);
    }

    @Test
    public void testTestingExample() {
        testExample("Introduction to Objects/Testing/Examples/src/TestingExample.kt", TestingExampleKt::main);
    }

    @Test
    public void testIntroducingNull() {
        testExample("Introduction to Objects/Exceptions/Examples/src/IntroducingNull.kt", IntroducingNullKt::main);
    }

    @Test
    public void testToIntException() {
        testExample("Introduction to Objects/Exceptions/Examples/src/ToIntException.kt", exceptions.ToIntExceptionKt::main);
    }

    @Test
    public void testAverageIncomeWithNull() {
        testExample("Introduction to Objects/Exceptions/Examples/src/AverageIncomeWithNull.kt", withnull.AverageIncomeWithNullKt::main);
    }

    @Test
    public void testAverageIncomeWithException() {
        testExample("Introduction to Objects/Exceptions/Examples/src/AverageIncomeWithException.kt", properexception.AverageIncomeWithExceptionKt::main);
    }

    @Test
    public void testIntroducingCapture() {
        testExample("Introduction to Objects/Exceptions/Examples/src/IntroducingCapture.kt", IntroducingCaptureKt::main);
    }

    @Test
    public void testAverageIncome() {
        testExample("Introduction to Objects/Exceptions/Examples/src/AverageIncome.kt", firstversion.AverageIncomeKt::main);
    }

    @Test
    public void testMutableList() {
        testExample("Introduction to Objects/Lists/Examples/src/MutableList.kt", MutableListKt::main);
    }

    @Test
    public void testMutListIsList() {
        testExample("Introduction to Objects/Lists/Examples/src/MutListIsList.kt", lists.MutListIsListKt::main);
    }

    @Test
    public void testParameterizedTypes() {
        testExample("Introduction to Objects/Lists/Examples/src/ParameterizedTypes.kt", ParameterizedTypesKt::main);
    }

    @Test
    public void testParameterizedReturn() {
        testExample("Introduction to Objects/Lists/Examples/src/ParameterizedReturn.kt", lists.ParameterizedReturnKt::main);
    }

    @Test
    public void testLists() {
        testExample("Introduction to Objects/Lists/Examples/src/Lists.kt", ListsKt::main);
    }

    @Test
    public void testMultipleListRefs() {
        testExample("Introduction to Objects/Lists/Examples/src/MultipleListRefs.kt", MultipleListRefsKt::main);
    }

    @Test
    public void testListUsefulFunction() {
        testExample("Introduction to Objects/Lists/Examples/src/ListUsefulFunction.kt", ListUsefulFunctionKt::main);
    }

    @Test
    public void testOutOfBounds() {
        testExample("Introduction to Objects/Lists/Examples/src/OutOfBounds.kt", OutOfBoundsKt::main);
    }

    @Test
    public void testVariableArgList() {
        testExample("Introduction to Objects/Variable Argument Lists/Examples/src/VariableArgList.kt", varargs.VariableArgListKt::main);
    }

    @Test
    public void testListOf() {
        testExample("Introduction to Objects/Variable Argument Lists/Examples/src/ListOf.kt", ListOfKt::main);
    }

    @Test
    public void testVarargLikeList() {
        testExample("Introduction to Objects/Variable Argument Lists/Examples/src/VarargLikeList.kt", varargs.VarargLikeListKt::main);
    }

    @Test
    public void testSpreadOperator() {
        testExample("Introduction to Objects/Variable Argument Lists/Examples/src/SpreadOperator.kt", SpreadOperatorKt::main);
    }

    @Test
    public void testMainArgs() {
        testExample("Introduction to Objects/Variable Argument Lists/Examples/src/MainArgs.kt", MainArgsKt::main);
    }

    @Test
    public void testVarargSum() {
        testExample("Introduction to Objects/Variable Argument Lists/Examples/src/VarargSum.kt", varargs.VarargSumKt::main);
    }

    @Test
    public void testTwoFunctionsWithVarargs() {
        testExample("Introduction to Objects/Variable Argument Lists/Examples/src/TwoFunctionsWithVarargs.kt", varargs.TwoFunctionsWithVarargsKt::main);
    }

    @Test
    public void testMainArgConversion() {
        testExample("Introduction to Objects/Variable Argument Lists/Examples/src/MainArgConversion.kt", MainArgConversionKt::main);
    }

    @Test
    public void testMutableSet() {
        testExample("Introduction to Objects/Sets/Examples/src/MutableSet.kt", MutableSetKt::main);
    }

    @Test
    public void testRemoveDuplicates() {
        testExample("Introduction to Objects/Sets/Examples/src/RemoveDuplicates.kt", RemoveDuplicatesKt::main);
    }

    @Test
    public void testSets() {
        testExample("Introduction to Objects/Sets/Examples/src/Sets.kt", SetsKt::main);
    }

    @Test
    public void testGetValue() {
        testExample("Introduction to Objects/Maps/Examples/src/GetValue.kt", GetValueKt::main);
    }

    @Test
    public void testMutableMaps() {
        testExample("Introduction to Objects/Maps/Examples/src/MutableMaps.kt", MutableMapsKt::main);
    }

    @Test
    public void testReadOnlyMaps() {
        testExample("Introduction to Objects/Maps/Examples/src/ReadOnlyMaps.kt", ReadOnlyMapsKt::main);
    }

    @Test
    public void testContactMap() {
        testExample("Introduction to Objects/Maps/Examples/src/ContactMap.kt", maps.ContactMapKt::main);
    }

    @Test
    public void testMaps() {
        testExample("Introduction to Objects/Maps/Examples/src/Maps.kt", MapsKt::main);
    }

    @Test
    public void testDefault() {
        testExample("Introduction to Objects/Property Accessors/Examples/src/Default.kt", propertyaccessors.DefaultKt::main);
    }

    @Test
    public void testLogChanges() {
        testExample("Introduction to Objects/Property Accessors/Examples/src/LogChanges.kt", propertyaccessors.LogChangesKt::main);
    }

    @Test
    public void testCounter() {
        testExample("Introduction to Objects/Property Accessors/Examples/src/Counter.kt", propertyaccessors.CounterKt::main);
    }

    @Test
    public void testData() {
        testExample("Introduction to Objects/Property Accessors/Examples/src/Data.kt", propertyaccessors.DataKt::main);
    }

    @Test
    public void testHamsters() {
        testExample("Introduction to Objects/Property Accessors/Examples/src/Hamsters.kt", propertyaccessors.HamstersKt::main);
    }

    @Test
    public void testClassBodies() {
        testExample("Introduction to Objects/Summary 2/Examples/src/ClassBodies.kt", summary2.ClassBodiesKt::main);
    }

    @Test
    public void testUsingAtomicTest() {
        testExample("Introduction to Objects/Summary 2/Examples/src/UsingAtomicTest.kt", UsingAtomicTestKt::main);
    }

    @Test
    public void testGetterAndSetter() {
        testExample("Introduction to Objects/Summary 2/Examples/src/GetterAndSetter.kt", summary2.GetterAndSetterKt::main);
    }

    @Test
    public void testReadonlyVsMutableList() {
        testExample("Introduction to Objects/Summary 2/Examples/src/ReadonlyVsMutableList.kt", ReadonlyVsMutableListKt::main);
    }

    @Test
    public void testListOfStrings() {
        testExample("Introduction to Objects/Summary 2/Examples/src/ListOfStrings.kt", ListOfStringsKt::main);
    }

    @Test
    public void testJetPack() {
        testExample("Introduction to Objects/Summary 2/Examples/src/JetPack.kt", summary2.JetPackKt::main);
    }

    @Test
    public void testASCIIMap() {
        testExample("Introduction to Objects/Summary 2/Examples/src/ASCIIMap.kt", ASCIIMapKt::main);
    }

    @Test
    public void testToDoubleException() {
        testExample("Introduction to Objects/Summary 2/Examples/src/ToDoubleException.kt", ToDoubleExceptionKt::main);
    }

    @Test
    public void testTicTacToe() {
        testExample("Introduction to Objects/Summary 2/Examples/src/TicTacToe.kt", summary2.TicTacToeKt::main);
    }

    @Test
    public void testListCollection() {
        testExample("Introduction to Objects/Summary 2/Examples/src/ListCollection.kt", ListCollectionKt::main);
    }

    @Test
    public void testExplicitTyping() {
        testExample("Introduction to Objects/Summary 2/Examples/src/ExplicitTyping.kt", summary2.ExplicitTypingKt::main);
    }

    @Test
    public void testQuadratic() {
        testExample("Introduction to Objects/Summary 2/Examples/src/Quadratic.kt", summary2.QuadraticKt::main);
    }

    @Test
    public void testBoxes() {
        testExample("Introduction to Objects/Summary 2/Examples/src/Boxes.kt", summary2.BoxesKt::main);
    }

    @Test
    public void testWildAnimals() {
        testExample("Introduction to Objects/Summary 2/Examples/src/WildAnimals.kt", summary2.WildAnimalsKt::main);
    }

    @Test
    public void testArraySpread() {
        testExample("Introduction to Objects/Summary 2/Examples/src/ArraySpread.kt", ArraySpreadKt::main);
    }

    @Test
    public void testTemperature() {
        testExample("Introduction to Objects/Summary 2/Examples/src/Temperature.kt", summary2.TemperatureKt::main);
    }

    @Test
    public void testAtomicTestCapture() {
        testExample("Introduction to Objects/Summary 2/Examples/src/AtomicTestCapture.kt", AtomicTestCaptureKt::main);
    }

    @Test
    public void testMultipleListReferences() {
        testExample("Introduction to Objects/Summary 2/Examples/src/MultipleListReferences.kt", MultipleListReferencesKt::main);
    }

    @Test
    public void testUseALibrary() {
        testExample("Introduction to Objects/Summary 2/Examples/src/UseALibrary.kt", UseALibraryKt::main);
    }

    @Test
    public void testVarArgs() {
        testExample("Introduction to Objects/Summary 2/Examples/src/VarArgs.kt", summary2.VarArgsKt::main);
    }

    @Test
    public void testColorSet() {
        testExample("Introduction to Objects/Summary 2/Examples/src/ColorSet.kt", summary2.ColorSetKt::main);
    }

    @Test
    public void testUsingTrace() {
        testExample("Introduction to Objects/Summary 2/Examples/src/UsingTrace.kt", UsingTraceKt::main);
    }

    @Test
    public void testPropertyReadWrite() {
        testExample("Introduction to Objects/Summary 2/Examples/src/PropertyReadWrite.kt", summary2.PropertyReadWriteKt::main);
    }

    @Test
    public void testQuoting() {
        testExample("Usability/Extension Functions/Examples/src/Quoting.kt", extensionfunctions.QuotingKt::main);
    }

    @Test
    public void testBookExtensions() {
        testExample("Usability/Extension Functions/Examples/src/BookExtensions.kt", extensionfunctions.BookExtensionsKt::main);
    }

    @Test
    public void testStrangeQuote() {
        testExample("Usability/Extension Functions/Examples/src/StrangeQuote.kt", extensionfunctions.StrangeQuoteKt::main);
    }

    @Test
    public void testQuote() {
        testExample("Usability/Extension Functions/Examples/src/Quote.kt", other.QuoteKt::main);
    }

    @Test
    public void testColor2() {
        testExample("Usability/Named & Default Arguments/Examples/src/Color2.kt", color2.Color2Kt::main);
    }

    @Test
    public void testNamedArguments() {
        testExample("Usability/Named & Default Arguments/Examples/src/NamedArguments.kt", color1.NamedArgumentsKt::main);
    }

    @Test
    public void testCreateString2() {
        testExample("Usability/Named & Default Arguments/Examples/src/CreateString2.kt", CreateString2Kt::main);
    }

    @Test
    public void testColor3() {
        testExample("Usability/Named & Default Arguments/Examples/src/Color3.kt", color3.Color3Kt::main);
    }

    @Test
    public void testArgumentOrder() {
        testExample("Usability/Named & Default Arguments/Examples/src/ArgumentOrder.kt", ArgumentOrderKt::main);
    }

    @Test
    public void testCreateString() {
        testExample("Usability/Named & Default Arguments/Examples/src/CreateString.kt", CreateStringKt::main);
    }

    @Test
    public void testTrimMargin() {
        testExample("Usability/Named & Default Arguments/Examples/src/TrimMargin.kt", TrimMarginKt::main);
    }

    @Test
    public void testEvaluation() {
        testExample("Usability/Named & Default Arguments/Examples/src/Evaluation.kt", namedanddefault.EvaluationKt::main);
    }

    @Test
    public void testOverloadingAdd() {
        testExample("Usability/Overloading/Examples/src/OverloadingAdd.kt", overloading.OverloadingAddKt::main);
    }

    @Test
    public void testOverloading() {
        testExample("Usability/Overloading/Examples/src/Overloading.kt", overloading.OverloadingKt::main);
    }

    @Test
    public void testWithDefaultArguments() {
        testExample("Usability/Overloading/Examples/src/WithDefaultArguments.kt", withdefaultarguments.WithDefaultArgumentsKt::main);
    }

    @Test
    public void testMemberVsExtension() {
        testExample("Usability/Overloading/Examples/src/MemberVsExtension.kt", overloading.MemberVsExtensionKt::main);
    }

    @Test
    public void testWithoutDefaultArguments() {
        testExample("Usability/Overloading/Examples/src/WithoutDefaultArguments.kt", withoutdefaultarguments.WithoutDefaultArgumentsKt::main);
    }

    @Test
    public void testOverloadedVsDefaultArg() {
        testExample("Usability/Overloading/Examples/src/OverloadedVsDefaultArg.kt", overloadingvsdefaultargs.OverloadedVsDefaultArgKt::main);
    }

    @Test
    public void testMixColors() {
        testExample("Usability/when Expressions/Examples/src/MixColors.kt", whenexpressions.MixColorsKt::main);
    }

    @Test
    public void testGermanOrdinals() {
        testExample("Usability/when Expressions/Examples/src/GermanOrdinals.kt", whenexpressions.GermanOrdinalsKt::main);
    }

    @Test
    public void testMatchingAgainstVals() {
        testExample("Usability/when Expressions/Examples/src/MatchingAgainstVals.kt", MatchingAgainstValsKt::main);
    }

    @Test
    public void testAnalyzeInput() {
        testExample("Usability/when Expressions/Examples/src/AnalyzeInput.kt", whenexpressions.AnalyzeInputKt::main);
    }

    @Test
    public void testBmiWhen() {
        testExample("Usability/when Expressions/Examples/src/BmiWhen.kt", whenexpressions.BmiWhenKt::main);
    }

    @Test
    public void testLevel() {
        testExample("Usability/Enumerations/Examples/src/Level.kt", enumerations.LevelKt::main);
    }

    @Test
    public void testEnumImport() {
        testExample("Usability/Enumerations/Examples/src/EnumImport.kt", EnumImportKt::main);
    }

    @Test
    public void testRecursiveEnumImport() {
        testExample("Usability/Enumerations/Examples/src/RecursiveEnumImport.kt", enumerations.RecursiveEnumImportKt::main);
    }

    @Test
    public void testDirection() {
        testExample("Usability/Enumerations/Examples/src/Direction.kt", enumerations.DirectionKt::main);
    }

    @Test
    public void testCheckingOptions() {
        testExample("Usability/Enumerations/Examples/src/CheckingOptions.kt", checkingoptions.CheckingOptionsKt::main);
    }

    @Test
    public void testCopyDataClass() {
        testExample("Usability/Data Classes/Examples/src/CopyDataClass.kt", dataclasses.CopyDataClassKt::main);
    }

    @Test
    public void testHashCode() {
        testExample("Usability/Data Classes/Examples/src/HashCode.kt", dataclasses.HashCodeKt::main);
    }

    @Test
    public void testDataClasses() {
        testExample("Usability/Data Classes/Examples/src/DataClasses.kt", dataclasses.DataClassesKt::main);
    }

    @Test
    public void testSimple() {
        testExample("Usability/Data Classes/Examples/src/Simple.kt", dataclasses.SimpleKt::main);
    }

    @Test
    public void testComputation() {
        testExample("Usability/Destructuring Declarations/Examples/src/Computation.kt", destructuring.ComputationKt::main);
    }

    @Test
    public void testLoopWithIndex() {
        testExample("Usability/Destructuring Declarations/Examples/src/LoopWithIndex.kt", LoopWithIndexKt::main);
    }

    @Test
    public void testPairDestructuring() {
        testExample("Usability/Destructuring Declarations/Examples/src/PairDestructuring.kt", PairDestructuringKt::main);
    }

    @Test
    public void testForLoop() {
        testExample("Usability/Destructuring Declarations/Examples/src/ForLoop.kt", ForLoopKt::main);
    }

    @Test
    public void testTuple() {
        testExample("Usability/Destructuring Declarations/Examples/src/Tuple.kt", destructuring.TupleKt::main);
    }

    @Test
    public void testPairs() {
        testExample("Usability/Destructuring Declarations/Examples/src/Pairs.kt", destructuring.PairsKt::main);
    }

    @Test
    public void testExplicitCheck() {
        testExample("Usability/Nullable Types/Examples/src/ExplicitCheck.kt", ExplicitCheckKt::main);
    }

    @Test
    public void testNullInMaps() {
        testExample("Usability/Nullable Types/Examples/src/NullInMaps.kt", NullInMapsKt::main);
    }

    @Test
    public void testAmphibian() {
        testExample("Usability/Nullable Types/Examples/src/Amphibian.kt", nullabletypes.AmphibianKt::main);
    }

    @Test
    public void testNullableInMap() {
        testExample("Usability/Nullable Types/Examples/src/NullableInMap.kt", NullableInMapKt::main);
    }

    @Test
    public void testDereference() {
        testExample("Usability/Nullable Types/Examples/src/Dereference.kt", DereferenceKt::main);
    }

    @Test
    public void testNullableTypes() {
        testExample("Usability/Nullable Types/Examples/src/NullableTypes.kt", NullableTypesKt::main);
    }

    @Test
    public void testElvisCall() {
        testExample("Usability/Safe Calls & the Elvis Operator/Examples/src/ElvisCall.kt", safecalls.ElvisCallKt::main);
    }

    @Test
    public void testDereferenceNull() {
        testExample("Usability/Safe Calls & the Elvis Operator/Examples/src/DereferenceNull.kt", DereferenceNullKt::main);
    }

    @Test
    public void testSafeOperation() {
        testExample("Usability/Safe Calls & the Elvis Operator/Examples/src/SafeOperation.kt", safecalls.SafeOperationKt::main);
    }

    @Test
    public void testChainedCalls() {
        testExample("Usability/Safe Calls & the Elvis Operator/Examples/src/ChainedCalls.kt", safecalls.ChainedCallsKt::main);
    }

    @Test
    public void testElvisOperator() {
        testExample("Usability/Safe Calls & the Elvis Operator/Examples/src/ElvisOperator.kt", ElvisOperatorKt::main);
    }

    @Test
    public void testSafeCall() {
        testExample("Usability/Safe Calls & the Elvis Operator/Examples/src/SafeCall.kt", safecalls.SafeCallKt::main);
    }

    @Test
    public void testNonNullAssertCall() {
        testExample("Usability/Non-Null Assertions/Examples/src/NonNullAssertCall.kt", NonNullAssertCallKt::main);
    }

    @Test
    public void testNonNullAssert() {
        testExample("Usability/Non-Null Assertions/Examples/src/NonNullAssert.kt", NonNullAssertKt::main);
    }

    @Test
    public void testValueFromMap() {
        testExample("Usability/Non-Null Assertions/Examples/src/ValueFromMap.kt", ValueFromMapKt::main);
    }

    @Test
    public void testNullableParameter() {
        testExample("Usability/Extensions for Nullable Types/Examples/src/NullableParameter.kt", nullableextensions.NullableParameterKt::main);
    }

    @Test
    public void testNullableExtension() {
        testExample("Usability/Extensions for Nullable Types/Examples/src/NullableExtension.kt", nullableextensions.NullableExtensionKt::main);
    }

    @Test
    public void testStringIsNullOr() {
        testExample("Usability/Extensions for Nullable Types/Examples/src/StringIsNullOr.kt", StringIsNullOrKt::main);
    }

    @Test
    public void testAnyInstead() {
        testExample("Usability/Introduction to Generics/Examples/src/AnyInstead.kt", introgenerics.AnyInsteadKt::main);
    }

    @Test
    public void testGenericListExtensions() {
        testExample("Usability/Introduction to Generics/Examples/src/GenericListExtensions.kt", introgenerics.GenericListExtensionsKt::main);
    }

    @Test
    public void testGenericHolder() {
        testExample("Usability/Introduction to Generics/Examples/src/GenericHolder.kt", introgenerics.GenericHolderKt::main);
    }

    @Test
    public void testGenericFunction() {
        testExample("Usability/Introduction to Generics/Examples/src/GenericFunction.kt", introgenerics.GenericFunctionKt::main);
    }

    @Test
    public void testRigidHolder() {
        testExample("Usability/Introduction to Generics/Examples/src/RigidHolder.kt", introgenerics.RigidHolderKt::main);
    }

    @Test
    public void testListOfStar() {
        testExample("Usability/Extension Properties/Examples/src/ListOfStar.kt", extensionproperties.ListOfStarKt::main);
    }

    @Test
    public void testGenericListExt() {
        testExample("Usability/Extension Properties/Examples/src/GenericListExt.kt", extensionproperties.GenericListExtKt::main);
    }

    @Test
    public void testAnyFromListOfStar() {
        testExample("Usability/Extension Properties/Examples/src/AnyFromListOfStar.kt", AnyFromListOfStarKt::main);
    }

    @Test
    public void testStringIndices() {
        testExample("Usability/Extension Properties/Examples/src/StringIndices.kt", extensionproperties.StringIndicesKt::main);
    }

    @Test
    public void testForControl() {
        testExample("Usability/break & continue/Examples/src/ForControl.kt", ForControlKt::main);
    }

    @Test
    public void testWhileControl() {
        testExample("Usability/break & continue/Examples/src/WhileControl.kt", WhileControlKt::main);
    }

    @Test
    public void testDoWhileControl() {
        testExample("Usability/break & continue/Examples/src/DoWhileControl.kt", DoWhileControlKt::main);
    }

    @Test
    public void testWhileLabeled() {
        testExample("Usability/break & continue/Examples/src/WhileLabeled.kt", WhileLabeledKt::main);
    }

    @Test
    public void testForLabeled() {
        testExample("Usability/break & continue/Examples/src/ForLabeled.kt", ForLabeledKt::main);
    }

    @Test
    public void testImproved() {
        testExample("Usability/break & continue/Examples/src/Improved.kt", ImprovedKt::main);
    }

    @Test
    public void testZeroArguments() {
        testExample("Functional Programming/Lambdas/Examples/src/ZeroArguments.kt", ZeroArgumentsKt::main);
    }

    @Test
    public void testOmittingParentheses() {
        testExample("Functional Programming/Lambdas/Examples/src/OmittingParentheses.kt", OmittingParenthesesKt::main);
    }

    @Test
    public void testLambdaIt() {
        testExample("Functional Programming/Lambdas/Examples/src/LambdaIt.kt", LambdaItKt::main);
    }

    @Test
    public void testTwoArgLambda() {
        testExample("Functional Programming/Lambdas/Examples/src/TwoArgLambda.kt", TwoArgLambdaKt::main);
    }

    @Test
    public void testLambdaAndNamedArgs() {
        testExample("Functional Programming/Lambdas/Examples/src/LambdaAndNamedArgs.kt", LambdaAndNamedArgsKt::main);
    }

    @Test
    public void testBasicLambda() {
        testExample("Functional Programming/Lambdas/Examples/src/BasicLambda.kt", BasicLambdaKt::main);
    }

    @Test
    public void testMapping() {
        testExample("Functional Programming/Lambdas/Examples/src/Mapping.kt", MappingKt::main);
    }

    @Test
    public void testListIndicesMap() {
        testExample("Functional Programming/Lambdas/Examples/src/ListIndicesMap.kt", ListIndicesMapKt::main);
    }

    @Test
    public void testJoinToString() {
        testExample("Functional Programming/Lambdas/Examples/src/JoinToString.kt", JoinToStringKt::main);
    }

    @Test
    public void testLambdaTypeInference() {
        testExample("Functional Programming/Lambdas/Examples/src/LambdaTypeInference.kt", LambdaTypeInferenceKt::main);
    }

    @Test
    public void testUnderscore() {
        testExample("Functional Programming/Lambdas/Examples/src/Underscore.kt", UnderscoreKt::main);
    }

    @Test
    public void testFilterEven() {
        testExample("Functional Programming/The Importance of Lambdas/Examples/src/FilterEven.kt", importanceoflambdas.FilterEvenKt::main);
    }

    @Test
    public void testFilter() {
        testExample("Functional Programming/The Importance of Lambdas/Examples/src/Filter.kt", FilterKt::main);
    }

    @Test
    public void testFunctionClosure() {
        testExample("Functional Programming/The Importance of Lambdas/Examples/src/FunctionClosure.kt", importanceoflambdas.FunctionClosureKt::main);
    }

    @Test
    public void testGreaterThan2() {
        testExample("Functional Programming/The Importance of Lambdas/Examples/src/GreaterThan2.kt", importanceoflambdas.GreaterThan2Kt::main);
    }

    @Test
    public void testSum() {
        testExample("Functional Programming/The Importance of Lambdas/Examples/src/Sum.kt", SumKt::main);
    }

    @Test
    public void testClosures2() {
        testExample("Functional Programming/The Importance of Lambdas/Examples/src/Closures2.kt", Closures2Kt::main);
    }

    @Test
    public void testStoringLambda() {
        testExample("Functional Programming/The Importance of Lambdas/Examples/src/StoringLambda.kt", StoringLambdaKt::main);
    }

    @Test
    public void testClosures() {
        testExample("Functional Programming/The Importance of Lambdas/Examples/src/Closures.kt", ClosuresKt::main);
    }

    @Test
    public void testPairOfLists() {
        testExample("Functional Programming/Operations on Collections/Examples/src/PairOfLists.kt", operationsoncollections.PairOfListsKt::main);
    }

    @Test
    public void testSetOperations() {
        testExample("Functional Programming/Operations on Collections/Examples/src/SetOperations.kt", SetOperationsKt::main);
    }

    @Test
    public void testPartition() {
        testExample("Functional Programming/Operations on Collections/Examples/src/Partition.kt", PartitionKt::main);
    }

    @Test
    public void testListInit() {
        testExample("Functional Programming/Operations on Collections/Examples/src/ListInit.kt", ListInitKt::main);
    }

    @Test
    public void testByOperations() {
        testExample("Functional Programming/Operations on Collections/Examples/src/ByOperations.kt", operationsoncollections.ByOperationsKt::main);
    }

    @Test
    public void testTakeOrDrop() {
        testExample("Functional Programming/Operations on Collections/Examples/src/TakeOrDrop.kt", TakeOrDropKt::main);
    }

    @Test
    public void testFilterNotNull() {
        testExample("Functional Programming/Operations on Collections/Examples/src/FilterNotNull.kt", FilterNotNullKt::main);
    }

    @Test
    public void testPredicates() {
        testExample("Functional Programming/Operations on Collections/Examples/src/Predicates.kt", PredicatesKt::main);
    }

    @Test
    public void testCreatingLists() {
        testExample("Functional Programming/Operations on Collections/Examples/src/CreatingLists.kt", CreatingListsKt::main);
    }

    @Test
    public void testConstructorReference() {
        testExample("Functional Programming/Member References/Examples/src/ConstructorReference.kt", memberreferences3.ConstructorReferenceKt::main);
    }

    @Test
    public void testTopLevelFunctionRef() {
        testExample("Functional Programming/Member References/Examples/src/TopLevelFunctionRef.kt", memberreferences2.TopLevelFunctionRefKt::main);
    }

    @Test
    public void testExtensionReference() {
        testExample("Functional Programming/Member References/Examples/src/ExtensionReference.kt", memberreferences.ExtensionReferenceKt::main);
    }

    @Test
    public void testSortWith() {
        testExample("Functional Programming/Member References/Examples/src/SortWith.kt", SortWithKt::main);
    }

    @Test
    public void testPropertyReference() {
        testExample("Functional Programming/Member References/Examples/src/PropertyReference.kt", memberreferences1.PropertyReferenceKt::main);
    }

    @Test
    public void testFunctionReference() {
        testExample("Functional Programming/Member References/Examples/src/FunctionReference.kt", memberreferences2.FunctionReferenceKt::main);
    }

    @Test
    public void testNullableReturn() {
        testExample("Functional Programming/Higher-Order Functions/Examples/src/NullableReturn.kt", NullableReturnKt::main);
    }

    @Test
    public void testNullableFunction() {
        testExample("Functional Programming/Higher-Order Functions/Examples/src/NullableFunction.kt", NullableFunctionKt::main);
    }

    @Test
    public void testRepeat() {
        testExample("Functional Programming/Higher-Order Functions/Examples/src/Repeat.kt", higherorderfunctions.RepeatKt::main);
    }

    @Test
    public void testCallingReference() {
        testExample("Functional Programming/Higher-Order Functions/Examples/src/CallingReference.kt", higherorderfunctions.CallingReferenceKt::main);
    }

    @Test
    public void testAny() {
        testExample("Functional Programming/Higher-Order Functions/Examples/src/Any.kt", higherorderfunctions.AnyKt::main);
    }

    @Test
    public void testRepeatByInt() {
        testExample("Functional Programming/Higher-Order Functions/Examples/src/RepeatByInt.kt", RepeatByIntKt::main);
    }

    @Test
    public void testIsPlus() {
        testExample("Functional Programming/Higher-Order Functions/Examples/src/IsPlus.kt", higherorderfunctions.IsPlusKt::main);
    }

    @Test
    public void testZipAndTransform() {
        testExample("Functional Programming/Manipulating Lists/Examples/src/ZipAndTransform.kt", manipulatinglists.ZipAndTransformKt::main);
    }

    @Test
    public void testWhyFlatMap() {
        testExample("Functional Programming/Manipulating Lists/Examples/src/WhyFlatMap.kt", manipulatinglists.WhyFlatMapKt::main);
    }

    @Test
    public void testZippingWithNext() {
        testExample("Functional Programming/Manipulating Lists/Examples/src/ZippingWithNext.kt", ZippingWithNextKt::main);
    }

    @Test
    public void testFlatten() {
        testExample("Functional Programming/Manipulating Lists/Examples/src/Flatten.kt", FlattenKt::main);
    }

    @Test
    public void testFlattenAndFlatMap() {
        testExample("Functional Programming/Manipulating Lists/Examples/src/FlattenAndFlatMap.kt", FlattenAndFlatMapKt::main);
    }

    @Test
    public void testZipper() {
        testExample("Functional Programming/Manipulating Lists/Examples/src/Zipper.kt", ZipperKt::main);
    }

    @Test
    public void testPlayingCards() {
        testExample("Functional Programming/Manipulating Lists/Examples/src/PlayingCards.kt", manipulatinglists.PlayingCardsKt::main);
    }

    @Test
    public void testGetOrPut() {
        testExample("Functional Programming/Building Maps/Examples/src/GetOrPut.kt", GetOrPutKt::main);
    }

    @Test
    public void testAssociateWith() {
        testExample("Functional Programming/Building Maps/Examples/src/AssociateWith.kt", AssociateWithKt::main);
    }

    @Test
    public void testGroupBy() {
        testExample("Functional Programming/Building Maps/Examples/src/GroupBy.kt", GroupByKt::main);
    }

    @Test
    public void testTransformingMap() {
        testExample("Functional Programming/Building Maps/Examples/src/TransformingMap.kt", TransformingMapKt::main);
    }

    @Test
    public void testAssociateBy() {
        testExample("Functional Programming/Building Maps/Examples/src/AssociateBy.kt", AssociateByKt::main);
    }

    @Test
    public void testSimilarOperation() {
        testExample("Functional Programming/Building Maps/Examples/src/SimilarOperation.kt", SimilarOperationKt::main);
    }

    @Test
    public void testGroupByVsFilter() {
        testExample("Functional Programming/Building Maps/Examples/src/GroupByVsFilter.kt", GroupByVsFilterKt::main);
    }

    @Test
    public void testAssociateByUnique() {
        testExample("Functional Programming/Building Maps/Examples/src/AssociateByUnique.kt", AssociateByUniqueKt::main);
    }

    @Test
    public void testFilterMap() {
        testExample("Functional Programming/Building Maps/Examples/src/FilterMap.kt", FilterMapKt::main);
    }

    @Test
    public void testDefineTakeIf() {
        testExample("Functional Programming/Sequences/Examples/src/DefineTakeIf.kt", sequences.DefineTakeIfKt::main);
    }

    @Test
    public void testNumberSequence2() {
        testExample("Functional Programming/Sequences/Examples/src/NumberSequence2.kt", NumberSequence2Kt::main);
    }

    @Test
    public void testEagerVsLazyEvaluation() {
        testExample("Functional Programming/Sequences/Examples/src/EagerVsLazyEvaluation.kt", sequences.EagerVsLazyEvaluationKt::main);
    }

    @Test
    public void testGenerateSequence1() {
        testExample("Functional Programming/Sequences/Examples/src/GenerateSequence1.kt", GenerateSequence1Kt::main);
    }

    @Test
    public void testGenerateSequence2() {
        testExample("Functional Programming/Sequences/Examples/src/GenerateSequence2.kt", GenerateSequence2Kt::main);
    }

    @Test
    public void testNoComputationYet() {
        testExample("Functional Programming/Sequences/Examples/src/NoComputationYet.kt", NoComputationYetKt::main);
    }

    @Test
    public void testTerminalOperations() {
        testExample("Functional Programming/Sequences/Examples/src/TerminalOperations.kt", TerminalOperationsKt::main);
    }

    @Test
    public void testEagerEvaluation() {
        testExample("Functional Programming/Sequences/Examples/src/EagerEvaluation.kt", EagerEvaluationKt::main);
    }

    @Test
    public void testInterestingSessions() {
        testExample("Functional Programming/Local Functions/Examples/src/InterestingSessions.kt", InterestingSessionsKt::main);
    }

    @Test
    public void testReturningFunc() {
        testExample("Functional Programming/Local Functions/Examples/src/ReturningFunc.kt", localfunctions.ReturningFuncKt::main);
    }

    @Test
    public void testReturnFromFun() {
        testExample("Functional Programming/Local Functions/Examples/src/ReturnFromFun.kt", ReturnFromFunKt::main);
    }

    @Test
    public void testReturnInsideLambda() {
        testExample("Functional Programming/Local Functions/Examples/src/ReturnInsideLambda.kt", ReturnInsideLambdaKt::main);
    }

    @Test
    public void testLocalFunctions() {
        testExample("Functional Programming/Local Functions/Examples/src/LocalFunctions.kt", LocalFunctionsKt::main);
    }

    @Test
    public void testLabeledReturn() {
        testExample("Functional Programming/Local Functions/Examples/src/LabeledReturn.kt", LabeledReturnKt::main);
    }

    @Test
    public void testLocalExtensions() {
        testExample("Functional Programming/Local Functions/Examples/src/LocalExtensions.kt", LocalExtensionsKt::main);
    }

    @Test
    public void testLocalFunctionReference() {
        testExample("Functional Programming/Local Functions/Examples/src/LocalFunctionReference.kt", LocalFunctionReferenceKt::main);
    }

    @Test
    public void testCustomLabel() {
        testExample("Functional Programming/Local Functions/Examples/src/CustomLabel.kt", CustomLabelKt::main);
    }

    @Test
    public void testFoldRight() {
        testExample("Functional Programming/Folding Lists/Examples/src/FoldRight.kt", FoldRightKt::main);
    }

    @Test
    public void testSumViaFold() {
        testExample("Functional Programming/Folding Lists/Examples/src/SumViaFold.kt", SumViaFoldKt::main);
    }

    @Test
    public void testFoldVsForLoop() {
        testExample("Functional Programming/Folding Lists/Examples/src/FoldVsForLoop.kt", FoldVsForLoopKt::main);
    }

    @Test
    public void testReduceAndReduceRight() {
        testExample("Functional Programming/Folding Lists/Examples/src/ReduceAndReduceRight.kt", ReduceAndReduceRightKt::main);
    }

    @Test
    public void testRunningFold() {
        testExample("Functional Programming/Folding Lists/Examples/src/RunningFold.kt", RunningFoldKt::main);
    }

    @Test
    public void testCallStack() {
        testExample("Functional Programming/Recursion/Examples/src/CallStack.kt", recursion.CallStackKt::main);
    }

    @Test
    public void testFactorial() {
        testExample("Functional Programming/Recursion/Examples/src/Factorial.kt", recursion.FactorialKt::main);
    }

    @Test
    public void testFibonacci() {
        testExample("Functional Programming/Recursion/Examples/src/Fibonacci.kt", recursion.FibonacciKt::main);
    }

    @Test
    public void testRecursionLimits() {
        testExample("Functional Programming/Recursion/Examples/src/RecursionLimits.kt", recursion.RecursionLimitsKt::main);
    }

    @Test
    public void testTailRecursiveSum() {
        testExample("Functional Programming/Recursion/Examples/src/TailRecursiveSum.kt", tailrecursion.TailRecursiveSumKt::main);
    }

    @Test
    public void testIteration() {
        testExample("Functional Programming/Recursion/Examples/src/Iteration.kt", iteration.IterationKt::main);
    }

    @Test
    public void testInfiniteRecursion() {
        testExample("Functional Programming/Recursion/Examples/src/InfiniteRecursion.kt", recursion.InfiniteRecursionKt::main);
    }

    @Test
    public void testVerySlowFibonacci() {
        testExample("Functional Programming/Recursion/Examples/src/VerySlowFibonacci.kt", slowfibonacci.VerySlowFibonacciKt::main);
    }

    @Test
    public void testHotness() {
        testExample("Object-Oriented Programming/Interfaces/Examples/src/Hotness.kt", interfaces.HotnessKt::main);
    }

    @Test
    public void testSAMConversion() {
        testExample("Object-Oriented Programming/Interfaces/Examples/src/SAMConversion.kt", interfaces.SAMConversionKt::main);
    }

    @Test
    public void testSAMImplementation() {
        testExample("Object-Oriented Programming/Interfaces/Examples/src/SAMImplementation.kt", interfaces.SAMImplementationKt::main);
    }

    @Test
    public void testComputer() {
        testExample("Object-Oriented Programming/Interfaces/Examples/src/Computer.kt", interfaces.ComputerKt::main);
    }

    @Test
    public void testPlayerInterface() {
        testExample("Object-Oriented Programming/Interfaces/Examples/src/PlayerInterface.kt", propertiesininterfaces.PlayerInterfaceKt::main);
    }

    @Test
    public void testInitSection() {
        testExample("Object-Oriented Programming/Complex Constructors/Examples/src/InitSection.kt", complexconstructors.InitSectionKt::main);
    }

    @Test
    public void testSimpleConstructor() {
        testExample("Object-Oriented Programming/Complex Constructors/Examples/src/SimpleConstructor.kt", complexconstructors.SimpleConstructorKt::main);
    }

    @Test
    public void testWithSecondary() {
        testExample("Object-Oriented Programming/Secondary Constructors/Examples/src/WithSecondary.kt", secondaryconstructors.WithSecondaryKt::main);
    }

    @Test
    public void testGardenItem() {
        testExample("Object-Oriented Programming/Secondary Constructors/Examples/src/GardenItem.kt", secondaryconstructors.GardenItemKt::main);
    }

    @Test
    public void testGreatApe() {
        testExample("Object-Oriented Programming/Inheritance/Examples/src/GreatApe.kt", inheritance.ape1.GreatApeKt::main);
    }

    @Test
    public void testGreatApe2() {
        testExample("Object-Oriented Programming/Inheritance/Examples/src/GreatApe2.kt", inheritance.ape2.GreatApe2Kt::main);
    }

    @Test
    public void testGreatApe3() {
        testExample("Object-Oriented Programming/Base Class Initialization/Examples/src/GreatApe3.kt", baseclassinit.GreatApe3Kt::main);
    }

    @Test
    public void testOtherConstructors() {
        testExample("Object-Oriented Programming/Base Class Initialization/Examples/src/OtherConstructors.kt", baseclassinit.OtherConstructorsKt::main);
    }

    @Test
    public void testHouse() {
        testExample("Object-Oriented Programming/Base Class Initialization/Examples/src/House.kt", baseclassinit.HouseKt::main);
    }

    @Test
    public void testPropertyAccessor() {
        testExample("Object-Oriented Programming/Abstract Classes/Examples/src/PropertyAccessor.kt", abstractclasses.PropertyAccessorKt::main);
    }

    @Test
    public void testImplementations() {
        testExample("Object-Oriented Programming/Abstract Classes/Examples/src/Implementations.kt", abstractclasses.ImplementationsKt::main);
    }

    @Test
    public void testInterfaceCollision() {
        testExample("Object-Oriented Programming/Abstract Classes/Examples/src/InterfaceCollision.kt", collision.InterfaceCollisionKt::main);
    }

    @Test
    public void testStateOfAClass() {
        testExample("Object-Oriented Programming/Abstract Classes/Examples/src/StateOfAClass.kt", abstractstate.StateOfAClassKt::main);
    }

    @Test
    public void testAssignment() {
        testExample("Object-Oriented Programming/Upcasting/Examples/src/Assignment.kt", AssignmentKt::main);
    }

    @Test
    public void testTrimmedMembers() {
        testExample("Object-Oriented Programming/Upcasting/Examples/src/TrimmedMembers.kt", upcasting.TrimmedMembersKt::main);
    }

    @Test
    public void testDrawing() {
        testExample("Object-Oriented Programming/Upcasting/Examples/src/Drawing.kt", upcasting.DrawingKt::main);
    }

    @Test
    public void testPet() {
        testExample("Object-Oriented Programming/Polymorphism/Examples/src/Pet.kt", polymorphism.PetKt::main);
    }

    @Test
    public void testFantasyGame() {
        testExample("Object-Oriented Programming/Polymorphism/Examples/src/FantasyGame.kt", polymorphism.FantasyGameKt::main);
    }

    @Test
    public void testCar() {
        testExample("Object-Oriented Programming/Composition/Examples/src/Car.kt", composition.CarKt::main);
    }

    @Test
    public void testDeviceMembers() {
        testExample("Object-Oriented Programming/Inheritance & Extensions/Examples/src/DeviceMembers.kt", inheritanceextensions1.DeviceMembersKt::main);
    }

    @Test
    public void testDeviceExtensions() {
        testExample("Object-Oriented Programming/Inheritance & Extensions/Examples/src/DeviceExtensions.kt", inheritanceextensions2.DeviceExtensionsKt::main);
    }

    @Test
    public void testNoExtOverride() {
        testExample("Object-Oriented Programming/Inheritance & Extensions/Examples/src/NoExtOverride.kt", inheritanceextensions.NoExtOverrideKt::main);
    }

    @Test
    public void testComposeAdapter() {
        testExample("Object-Oriented Programming/Inheritance & Extensions/Examples/src/ComposeAdapter.kt", inheritanceextensions2.ComposeAdapterKt::main);
    }

    @Test
    public void testExtensionFuncs() {
        testExample("Object-Oriented Programming/Inheritance & Extensions/Examples/src/ExtensionFuncs.kt", inheritanceextensions2.ExtensionFuncsKt::main);
    }

    @Test
    public void testAdapter() {
        testExample("Object-Oriented Programming/Inheritance & Extensions/Examples/src/Adapter.kt", inheritanceextensions.AdapterKt::main);
    }

    @Test
    public void testConvention() {
        testExample("Object-Oriented Programming/Inheritance & Extensions/Examples/src/Convention.kt", inheritanceextensions.ConventionKt::main);
    }

    @Test
    public void testTemperatureDelta() {
        testExample("Object-Oriented Programming/Inheritance & Extensions/Examples/src/TemperatureDelta.kt", inheritanceextensions.TemperatureDeltaKt::main);
    }

    @Test
    public void testInheritAdd() {
        testExample("Object-Oriented Programming/Inheritance & Extensions/Examples/src/InheritAdd.kt", inheritanceextensions.InheritAddKt::main);
    }

    @Test
    public void testModelingMI() {
        testExample("Object-Oriented Programming/Class Delegation/Examples/src/ModelingMI.kt", classdelegation.ModelingMIKt::main);
    }

    @Test
    public void testExplicitDelegation() {
        testExample("Object-Oriented Programming/Class Delegation/Examples/src/ExplicitDelegation.kt", classdelegation.ExplicitDelegationKt::main);
    }

    @Test
    public void testDelegatedControls() {
        testExample("Object-Oriented Programming/Class Delegation/Examples/src/DelegatedControls.kt", classdelegation.DelegatedControlsKt::main);
    }

    @Test
    public void testFindType() {
        testExample("Object-Oriented Programming/Downcasting/Examples/src/FindType.kt", downcasting.FindTypeKt::main);
    }

    @Test
    public void testNarrowingUpcast() {
        testExample("Object-Oriented Programming/Downcasting/Examples/src/NarrowingUpcast.kt", downcasting.NarrowingUpcastKt::main);
    }

    @Test
    public void testUnsafe() {
        testExample("Object-Oriented Programming/Downcasting/Examples/src/Unsafe.kt", downcasting.UnsafeKt::main);
    }

    @Test
    public void testCreature() {
        testExample("Object-Oriented Programming/Downcasting/Examples/src/Creature.kt", downcasting.CreatureKt::main);
    }

    @Test
    public void testSafe() {
        testExample("Object-Oriented Programming/Downcasting/Examples/src/Safe.kt", downcasting.SafeKt::main);
    }

    @Test
    public void testIsKeyword() {
        testExample("Object-Oriented Programming/Downcasting/Examples/src/IsKeyword.kt", IsKeywordKt::main);
    }

    @Test
    public void testFilterIsInstance() {
        testExample("Object-Oriented Programming/Downcasting/Examples/src/FilterIsInstance.kt", FilterIsInstanceKt::main);
    }

    @Test
    public void testUnSealed() {
        testExample("Object-Oriented Programming/Sealed Classes/Examples/src/UnSealed.kt", withoutsealedclasses.UnSealedKt::main);
    }

    @Test
    public void testSealedSubclasses() {
        testExample("Object-Oriented Programming/Sealed Classes/Examples/src/SealedSubclasses.kt", sealedclasses.SealedSubclassesKt::main);
    }

    @Test
    public void testSealedClasses() {
        testExample("Object-Oriented Programming/Sealed Classes/Examples/src/SealedClasses.kt", sealedclasses.SealedClassesKt::main);
    }

    @Test
    public void testSealedVsAbstract() {
        testExample("Object-Oriented Programming/Sealed Classes/Examples/src/SealedVsAbstract.kt", sealedclasses.SealedVsAbstractKt::main);
    }

    @Test
    public void testTypeCheck3() {
        testExample("Object-Oriented Programming/Type Checking/Examples/src/TypeCheck3.kt", typechecking3.TypeCheck3Kt::main);
    }

    @Test
    public void testTypeCheck2() {
        testExample("Object-Oriented Programming/Type Checking/Examples/src/TypeCheck2.kt", typechecking.TypeCheck2Kt::main);
    }

    @Test
    public void testInsects() {
        testExample("Object-Oriented Programming/Type Checking/Examples/src/Insects.kt", typechecking.InsectsKt::main);
    }

    @Test
    public void testBeverageContainer3() {
        testExample("Object-Oriented Programming/Type Checking/Examples/src/BeverageContainer3.kt", typechecking3.BeverageContainer3Kt::main);
    }

    @Test
    public void testBeverageContainer2() {
        testExample("Object-Oriented Programming/Type Checking/Examples/src/BeverageContainer2.kt", typechecking2.BeverageContainer2Kt::main);
    }

    @Test
    public void testBeverageContainer() {
        testExample("Object-Oriented Programming/Type Checking/Examples/src/BeverageContainer.kt", typechecking.BeverageContainerKt::main);
    }

    @Test
    public void testTypeCheck1() {
        testExample("Object-Oriented Programming/Type Checking/Examples/src/TypeCheck1.kt", typechecking.TypeCheck1Kt::main);
    }

    @Test
    public void testFillIt() {
        testExample("Object-Oriented Programming/Nested Classes/Examples/src/FillIt.kt", nestedclasses.FillItKt::main);
    }

    @Test
    public void testWithinInterface() {
        testExample("Object-Oriented Programming/Nested Classes/Examples/src/WithinInterface.kt", nestedclasses.WithinInterfaceKt::main);
    }

    @Test
    public void testReturnLocal() {
        testExample("Object-Oriented Programming/Nested Classes/Examples/src/ReturnLocal.kt", nestedclasses.ReturnLocalKt::main);
    }

    @Test
    public void testNestedHouse() {
        testExample("Object-Oriented Programming/Nested Classes/Examples/src/NestedHouse.kt", nestedclasses.NestedHouseKt::main);
    }

    @Test
    public void testTicket() {
        testExample("Object-Oriented Programming/Nested Classes/Examples/src/Ticket.kt", nestedclasses.TicketKt::main);
    }

    @Test
    public void testAirport() {
        testExample("Object-Oriented Programming/Nested Classes/Examples/src/Airport.kt", nestedclasses.AirportKt::main);
    }

    @Test
    public void testShare2() {
        testExample("Object-Oriented Programming/Objects/Examples/src/Share2.kt", objectshare2.Share2Kt::main);
    }

    @Test
    public void testObjectNesting() {
        testExample("Object-Oriented Programming/Objects/Examples/src/ObjectNesting.kt", objects.ObjectNestingKt::main);
    }

    @Test
    public void testObjectKeyword() {
        testExample("Object-Oriented Programming/Objects/Examples/src/ObjectKeyword.kt", objects.ObjectKeywordKt::main);
    }

    @Test
    public void testObjectInheritance() {
        testExample("Object-Oriented Programming/Objects/Examples/src/ObjectInheritance.kt", objects.ObjectInheritanceKt::main);
    }

    @Test
    public void testQualifiedThis() {
        testExample("Object-Oriented Programming/Inner Classes/Examples/src/QualifiedThis.kt", innerclasses.QualifiedThisKt::main);
    }

    @Test
    public void testHotel() {
        testExample("Object-Oriented Programming/Inner Classes/Examples/src/Hotel.kt", innerclasses.HotelKt::main);
    }

    @Test
    public void testCounterFactory() {
        testExample("Object-Oriented Programming/Inner Classes/Examples/src/CounterFactory.kt", innerclasses.CounterFactoryKt::main);
    }

    @Test
    public void testInnerClassInheritance() {
        testExample("Object-Oriented Programming/Inner Classes/Examples/src/InnerClassInheritance.kt", innerclasses.InnerClassInheritanceKt::main);
    }

    @Test
    public void testLocalInnerClasses() {
        testExample("Object-Oriented Programming/Inner Classes/Examples/src/LocalInnerClasses.kt", innerclasses.LocalInnerClassesKt::main);
    }

    @Test
    public void testInitialization() {
        testExample("Object-Oriented Programming/Companion Objects/Examples/src/Initialization.kt", companionobjects.InitializationKt::main);
    }

    @Test
    public void testObjectProperty() {
        testExample("Object-Oriented Programming/Companion Objects/Examples/src/ObjectProperty.kt", companionobjects.ObjectPropertyKt::main);
    }

    @Test
    public void testCompanionDelegation() {
        testExample("Object-Oriented Programming/Companion Objects/Examples/src/CompanionDelegation.kt", companionobjects.CompanionDelegationKt::main);
    }

    @Test
    public void testNamingCompanionObjects() {
        testExample("Object-Oriented Programming/Companion Objects/Examples/src/NamingCompanionObjects.kt", companionobjects.NamingCompanionObjectsKt::main);
    }

    @Test
    public void testCompanionObject() {
        testExample("Object-Oriented Programming/Companion Objects/Examples/src/CompanionObject.kt", companionobjects.CompanionObjectKt::main);
    }

    @Test
    public void testObjectFunctions() {
        testExample("Object-Oriented Programming/Companion Objects/Examples/src/ObjectFunctions.kt", companionobjects.ObjectFunctionsKt::main);
    }

    @Test
    public void testDelegateAndExtend() {
        testExample("Object-Oriented Programming/Companion Objects/Examples/src/DelegateAndExtend.kt", companionobjects.DelegateAndExtendKt::main);
    }

    @Test
    public void testObjectCounter() {
        testExample("Object-Oriented Programming/Companion Objects/Examples/src/ObjectCounter.kt", companionobjects.ObjectCounterKt::main);
    }

    @Test
    public void testCompanionFactory() {
        testExample("Object-Oriented Programming/Companion Objects/Examples/src/CompanionFactory.kt", companionobjects.CompanionFactoryKt::main);
    }

    @Test
    public void testCompanionInstance() {
        testExample("Object-Oriented Programming/Companion Objects/Examples/src/CompanionInstance.kt", companionobjects.CompanionInstanceKt::main);
    }

    @Test
    public void testTryFinally() {
        testExample("Preventing Failure/Exception Handling/Examples/src/TryFinally.kt", exceptionhandling.TryFinallyKt::main);
    }

    @Test
    public void testNewException() {
        testExample("Preventing Failure/Exception Handling/Examples/src/NewException.kt", exceptionhandling.NewExceptionKt::main);
    }

    @Test
    public void testCaptureImplementation() {
        testExample("Preventing Failure/Exception Handling/Examples/src/CaptureImplementation.kt", exceptionhandling.CaptureImplementationKt::main);
    }

    @Test
    public void testGuaranteedCleanup() {
        testExample("Preventing Failure/Exception Handling/Examples/src/GuaranteedCleanup.kt", exceptionhandling.GuaranteedCleanupKt::main);
    }

    @Test
    public void testDefiningExceptions() {
        testExample("Preventing Failure/Exception Handling/Examples/src/DefiningExceptions.kt", exceptionhandling.DefiningExceptionsKt::main);
    }

    @Test
    public void testStacktrace() {
        testExample("Preventing Failure/Exception Handling/Examples/src/Stacktrace.kt", stacktrace.StacktraceKt::main);
    }

    @Test
    public void testLibraryException() {
        testExample("Preventing Failure/Exception Handling/Examples/src/LibraryException.kt", exceptionhandling.LibraryExceptionKt::main);
    }

    @Test
    public void testHandlers() {
        testExample("Preventing Failure/Exception Handling/Examples/src/Handlers.kt", exceptionhandling.HandlersKt::main);
    }

    @Test
    public void testHierarchy() {
        testExample("Preventing Failure/Exception Handling/Examples/src/Hierarchy.kt", exceptionhandling.HierarchyKt::main);
    }

    @Test
    public void testRequireNotNull() {
        testExample("Preventing Failure/Check Instructions/Examples/src/RequireNotNull.kt", checkinstructions.RequireNotNullKt::main);
    }

    @Test
    public void testPostconditions() {
        testExample("Preventing Failure/Check Instructions/Examples/src/Postconditions.kt", checkinstructions.PostconditionsKt::main);
    }

    @Test
    public void testDataFile() {
        testExample("Preventing Failure/Check Instructions/Examples/src/DataFile.kt", checkinstructions.DataFileKt::main);
    }

    @Test
    public void testSingleArgRequire() {
        testExample("Preventing Failure/Check Instructions/Examples/src/SingleArgRequire.kt", checkinstructions.SingleArgRequireKt::main);
    }

    @Test
    public void testJulianMonth() {
        testExample("Preventing Failure/Check Instructions/Examples/src/JulianMonth.kt", checkinstructions.JulianMonthKt::main);
    }

    @Test
    public void testGetTrace() {
        testExample("Preventing Failure/Check Instructions/Examples/src/GetTrace.kt", checkinstructions.GetTraceKt::main);
    }

    @Test
    public void testQuadraticRequire() {
        testExample("Preventing Failure/Check Instructions/Examples/src/QuadraticRequire.kt", checkinstructions.QuadraticRequireKt::main);
    }

    @Test
    public void testListOfNothing() {
        testExample("Preventing Failure/The Nothing Type/Examples/src/ListOfNothing.kt", ListOfNothingKt::main);
    }

    @Test
    public void testFail() {
        testExample("Preventing Failure/The Nothing Type/Examples/src/Fail.kt", nothingtype.FailKt::main);
    }

    @Test
    public void testTodo() {
        testExample("Preventing Failure/The Nothing Type/Examples/src/Todo.kt", nothingtype.TodoKt::main);
    }

    @Test
    public void testCheckObject2() {
        testExample("Preventing Failure/The Nothing Type/Examples/src/CheckObject2.kt", nothingtype.CheckObject2Kt::main);
    }

    @Test
    public void testCheckObject() {
        testExample("Preventing Failure/The Nothing Type/Examples/src/CheckObject.kt", nothingtype.CheckObjectKt::main);
    }

    @Test
    public void testUseLines() {
        testExample("Preventing Failure/Resource Cleanup/Examples/src/UseLines.kt", UseLinesKt::main);
    }

    @Test
    public void testUsable() {
        testExample("Preventing Failure/Resource Cleanup/Examples/src/Usable.kt", resourcecleanup.UsableKt::main);
    }

    @Test
    public void testAutoCloseable() {
        testExample("Preventing Failure/Resource Cleanup/Examples/src/AutoCloseable.kt", AutoCloseableKt::main);
    }

    @Test
    public void testForEachLine() {
        testExample("Preventing Failure/Resource Cleanup/Examples/src/ForEachLine.kt", ForEachLineKt::main);
    }

    @Test
    public void testUseAtomicLog() {
        testExample("Preventing Failure/Logging/Examples/src/UseAtomicLog.kt", useatomiclog.UseAtomicLogKt::main);
    }

    @Test
    public void testBasicLogging() {
        testExample("Preventing Failure/Logging/Examples/src/BasicLogging.kt", logging.BasicLoggingKt::main);
    }

    @Test
    public void testSimpleLoggingStrategy() {
        testExample("Preventing Failure/Logging/Examples/src/SimpleLoggingStrategy.kt", logging.SimpleLoggingStrategyKt::main);
    }

    @Test
    public void testNoFramework() {
        testExample("Preventing Failure/Unit Testing/Examples/src/NoFramework.kt", unittesting.NoFrameworkKt::main);
    }

    @Test
    public void testUsingExpect() {
        testExample("Preventing Failure/Unit Testing/Examples/src/UsingExpect.kt", unittesting.UsingExpectKt::main);
    }

    @Test
    public void testSampleTest() {
        testUnitTest(unittesting.SampleTest.class);
    }

    @Test
    public void testLearnerTest() {
        testUnitTest(unittesting.LearnerTest.class);
    }

    @Test
    public void testStateMachineTest() {
        testUnitTest(unittesting.StateMachineTest.class);
    }

    @Test
    public void testTransform() {
        testExample("Power Tools/Extension Lambdas/Examples/src/Transform.kt", extensionlambdas.TransformKt::main);
    }

    @Test
    public void testExtensionPolymorphism() {
        testExample("Power Tools/Extension Lambdas/Examples/src/ExtensionPolymorphism.kt", extensionlambdas.ExtensionPolymorphismKt::main);
    }

    @Test
    public void testParameters() {
        testExample("Power Tools/Extension Lambdas/Examples/src/Parameters.kt", extensionlambdas.ParametersKt::main);
    }

    @Test
    public void testStringCreation() {
        testExample("Power Tools/Extension Lambdas/Examples/src/StringCreation.kt", extensionlambdas.StringCreationKt::main);
    }

    @Test
    public void testAnonymousFunction() {
        testExample("Power Tools/Extension Lambdas/Examples/src/AnonymousFunction.kt", extensionlambdas.AnonymousFunctionKt::main);
    }

    @Test
    public void testSandwich() {
        testExample("Power Tools/Extension Lambdas/Examples/src/Sandwich.kt", sandwich.SandwichKt::main);
    }

    @Test
    public void testFuncReferences() {
        testExample("Power Tools/Extension Lambdas/Examples/src/FuncReferences.kt", extensionlambdas.FuncReferencesKt::main);
    }

    @Test
    public void testVanbo() {
        testExample("Power Tools/Extension Lambdas/Examples/src/Vanbo.kt", extensionlambdas.VanboKt::main);
    }

    @Test
    public void testListsAndMaps() {
        testExample("Power Tools/Extension Lambdas/Examples/src/ListsAndMaps.kt", extensionlambdas.ListsAndMapsKt::main);
    }

    @Test
    public void testAndNullability() {
        testExample("Power Tools/Scope Functions/Examples/src/AndNullability.kt", scopefunctions.AndNullabilityKt::main);
    }

    @Test
    public void testBlob() {
        testExample("Power Tools/Scope Functions/Examples/src/Blob.kt", scopefunctions.BlobKt::main);
    }

    @Test
    public void testNullGnome() {
        testExample("Power Tools/Scope Functions/Examples/src/NullGnome.kt", scopefunctions.NullGnomeKt::main);
    }

    @Test
    public void testNesting() {
        testExample("Power Tools/Scope Functions/Examples/src/Nesting.kt", scopefunctions.NestingKt::main);
    }

    @Test
    public void testMapLookup() {
        testExample("Power Tools/Scope Functions/Examples/src/MapLookup.kt", scopefunctions.MapLookupKt::main);
    }

    @Test
    public void testNameTag() {
        testExample("Power Tools/Scope Functions/Examples/src/NameTag.kt", scopefunctions.NameTagKt::main);
    }

    @Test
    public void testDifferences() {
        testExample("Power Tools/Scope Functions/Examples/src/Differences.kt", scopefunctions.DifferencesKt::main);
    }

    @Test
    public void testSpeakers() {
        testExample("Power Tools/Creating Generics/Examples/src/Speakers.kt", creatinggenerics.SpeakersKt::main);
    }

    @Test
    public void testMapCrate() {
        testExample("Power Tools/Creating Generics/Examples/src/MapCrate.kt", creatinggenerics.MapCrateKt::main);
    }

    @Test
    public void testCrate() {
        testExample("Power Tools/Creating Generics/Examples/src/Crate.kt", creatinggenerics.CrateKt::main);
    }

    @Test
    public void testConstrained() {
        testExample("Power Tools/Creating Generics/Examples/src/Constrained.kt", creatinggenerics.ConstrainedKt::main);
    }

    @Test
    public void testCovariantList() {
        testExample("Power Tools/Creating Generics/Examples/src/CovariantList.kt", variance.CovariantListKt::main);
    }

    @Test
    public void testSelect() {
        testExample("Power Tools/Creating Generics/Examples/src/Select.kt", creatinggenerics.SelectKt::main);
    }

    @Test
    public void testErasure() {
        testExample("Power Tools/Creating Generics/Examples/src/Erasure.kt", creatinggenerics.ErasureKt::main);
    }

    @Test
    public void testInBoxAssignment() {
        testExample("Power Tools/Creating Generics/Examples/src/InBoxAssignment.kt", variance.InBoxAssignmentKt::main);
    }

    @Test
    public void testCarCrate() {
        testExample("Power Tools/Creating Generics/Examples/src/CarCrate.kt", creatinggenerics.CarCrateKt::main);
    }

    @Test
    public void testCheckType() {
        testExample("Power Tools/Creating Generics/Examples/src/CheckType.kt", creatinggenerics.CheckTypeKt::main);
    }

    @Test
    public void testNonGenericConstraint() {
        testExample("Power Tools/Creating Generics/Examples/src/NonGenericConstraint.kt", creatinggenerics.NonGenericConstraintKt::main);
    }

    @Test
    public void testMemberOperator() {
        testExample("Power Tools/Operator Overloading/Examples/src/MemberOperator.kt", operatoroverloading.MemberOperatorKt::main);
    }

    @Test
    public void testBackticks() {
        testExample("Power Tools/Operator Overloading/Examples/src/Backticks.kt", operatoroverloading.BackticksKt::main);
    }

    @Test
    public void testStringInvoke() {
        testExample("Power Tools/Operator Overloading/Examples/src/StringInvoke.kt", operatoroverloading.StringInvokeKt::main);
    }

    @Test
    public void testSwearing() {
        testExample("Power Tools/Operator Overloading/Examples/src/Swearing.kt", operatoroverloading.SwearingKt::main);
    }

    @Test
    public void testDefiningEquality() {
        testExample("Power Tools/Operator Overloading/Examples/src/DefiningEquality.kt", operatoroverloading.DefiningEqualityKt::main);
    }

    @Test
    public void testComparison() {
        testExample("Power Tools/Operator Overloading/Examples/src/Comparison.kt", operatoroverloading.ComparisonKt::main);
    }

    @Test
    public void testContainerAccess() {
        testExample("Power Tools/Operator Overloading/Examples/src/ContainerAccess.kt", operatoroverloading.ContainerAccessKt::main);
    }

    @Test
    public void testRanges() {
        testExample("Power Tools/Operator Overloading/Examples/src/Ranges.kt", operatoroverloading.RangesKt::main);
    }

    @Test
    public void testInvoke() {
        testExample("Power Tools/Operator Overloading/Examples/src/Invoke.kt", operatoroverloading.InvokeKt::main);
    }

    @Test
    public void testConfusingPrecedence() {
        testExample("Power Tools/Operator Overloading/Examples/src/ConfusingPrecedence.kt", operatoroverloading.ConfusingPrecedenceKt::main);
    }

    @Test
    public void testMolecule() {
        testExample("Power Tools/Operator Overloading/Examples/src/Molecule.kt", operatoroverloading.MoleculeKt::main);
    }

    @Test
    public void testDifferentTypes() {
        testExample("Power Tools/Operator Overloading/Examples/src/DifferentTypes.kt", operatoroverloading.DifferentTypesKt::main);
    }

    @Test
    public void testDefaultEquality() {
        testExample("Power Tools/Operator Overloading/Examples/src/DefaultEquality.kt", operatoroverloading.DefaultEqualityKt::main);
    }

    @Test
    public void testInvokeFunctionType() {
        testExample("Power Tools/Operator Overloading/Examples/src/InvokeFunctionType.kt", operatoroverloading.InvokeFunctionTypeKt::main);
    }

    @Test
    public void testEqualsForNullable() {
        testExample("Power Tools/Operator Overloading/Examples/src/EqualsForNullable.kt", operatoroverloading.EqualsForNullableKt::main);
    }

    @Test
    public void testNum() {
        testExample("Power Tools/Operator Overloading/Examples/src/Num.kt", operatoroverloading.NumKt::main);
    }

    @Test
    public void testArithmeticOperators() {
        testExample("Power Tools/Operator Overloading/Examples/src/ArithmeticOperators.kt", operatoroverloading.ArithmeticOperatorsKt::main);
    }

    @Test
    public void testCompareTo() {
        testExample("Power Tools/Using Operators/Examples/src/CompareTo.kt", usingoperators.CompareToKt::main);
    }

    @Test
    public void testOperatorPlus() {
        testExample("Power Tools/Using Operators/Examples/src/OperatorPlus.kt", OperatorPlusKt::main);
    }

    @Test
    public void testNewAngle() {
        testExample("Power Tools/Using Operators/Examples/src/NewAngle.kt", NewAngleKt::main);
    }

    @Test
    public void testUnexpected() {
        testExample("Power Tools/Using Operators/Examples/src/Unexpected.kt", UnexpectedKt::main);
    }

    @Test
    public void testReadOnlyAndPlus() {
        testExample("Power Tools/Using Operators/Examples/src/ReadOnlyAndPlus.kt", ReadOnlyAndPlusKt::main);
    }

    @Test
    public void testDestructuringMap() {
        testExample("Power Tools/Using Operators/Examples/src/DestructuringMap.kt", DestructuringMapKt::main);
    }

    @Test
    public void testDestructuringData() {
        testExample("Power Tools/Using Operators/Examples/src/DestructuringData.kt", usingoperators.DestructuringDataKt::main);
    }

    @Test
    public void testComparableRange() {
        testExample("Power Tools/Using Operators/Examples/src/ComparableRange.kt", usingoperators.ComparableRangeKt::main);
    }

    @Test
    public void testDestructuringDuo() {
        testExample("Power Tools/Using Operators/Examples/src/DestructuringDuo.kt", usingoperators.DestructuringDuoKt::main);
    }

    @Test
    public void testBasicReadWrite() {
        testExample("Power Tools/Property Delegation/Examples/src/BasicReadWrite.kt", propertydelegation.BasicReadWriteKt::main);
    }

    @Test
    public void testBasicReadWrite2() {
        testExample("Power Tools/Property Delegation/Examples/src/BasicReadWrite2.kt", propertydelegation.BasicReadWrite2Kt::main);
    }

    @Test
    public void testBasicRead2() {
        testExample("Power Tools/Property Delegation/Examples/src/BasicRead2.kt", propertydelegation.BasicRead2Kt::main);
    }

    @Test
    public void testAccessibility() {
        testExample("Power Tools/Property Delegation/Examples/src/Accessibility.kt", propertydelegation.AccessibilityKt::main);
    }

    @Test
    public void testAdd() {
        testExample("Power Tools/Property Delegation/Examples/src/Add.kt", propertydelegation2.AddKt::main);
    }

    @Test
    public void testFibonacciProperty() {
        testExample("Power Tools/Property Delegation/Examples/src/FibonacciProperty.kt", propertydelegation.FibonacciPropertyKt::main);
    }

    @Test
    public void testConfiguration() {
        testExample("Power Tools/Property Delegation/Examples/src/Configuration.kt", propertydelegation.ConfigurationKt::main);
    }

    @Test
    public void testBasicRead() {
        testExample("Power Tools/Property Delegation/Examples/src/BasicRead.kt", propertydelegation.BasicReadKt::main);
    }

    @Test
    public void testCarService() {
        testExample("Power Tools/Property Delegation Tools/Examples/src/CarService.kt", propertydelegation.CarServiceKt::main);
    }

    @Test
    public void testTeamWithTraditions() {
        testExample("Power Tools/Property Delegation Tools/Examples/src/TeamWithTraditions.kt", delegationtools.TeamWithTraditionsKt::main);
    }

    @Test
    public void testNeverNull() {
        testExample("Power Tools/Property Delegation Tools/Examples/src/NeverNull.kt", delegationtools.NeverNullKt::main);
    }

    @Test
    public void testTeam() {
        testExample("Power Tools/Property Delegation Tools/Examples/src/Team.kt", delegationtools.TeamKt::main);
    }

    @Test
    public void testPropertyOptions() {
        testExample("Power Tools/Lazy Initialization/Examples/src/PropertyOptions.kt", lazyinitialization.PropertyOptionsKt::main);
    }

    @Test
    public void testLazySyntax() {
        testExample("Power Tools/Lazy Initialization/Examples/src/LazySyntax.kt", lazyinitialization.LazySyntaxKt::main);
    }

    @Test
    public void testLazyInt() {
        testExample("Power Tools/Lazy Initialization/Examples/src/LazyInt.kt", lazyinitialization.LazyIntKt::main);
    }

    @Test
    public void testIsInitialized() {
        testExample("Power Tools/Late Initialization/Examples/src/IsInitialized.kt", lateinitialization.IsInitializedKt::main);
    }

    @Test
    public void testFaultySuitcase() {
        testExample("Power Tools/Late Initialization/Examples/src/FaultySuitcase.kt", lateinitialization.FaultySuitcaseKt::main);
    }

    @Test
    public void testBetterSuitcase() {
        testExample("Power Tools/Late Initialization/Examples/src/BetterSuitcase.kt", lateinitialization.BetterSuitcaseKt::main);
    }

    @Test
    public void testSuitcase() {
        testExample("Power Tools/Late Initialization/Examples/src/Suitcase.kt", lateinitialization.SuitcaseKt::main);
    }

    @Test
    public void testAnnotatedJava() {
        testExample("Appendices/Java Interoperability/Examples/src/AnnotatedJava.kt", interop.AnnotatedJavaKt::main);
    }

    @Test
    public void testReadOnlyCollections() {
        testExample("Appendices/Java Interoperability/Examples/src/ReadOnlyCollections.kt", ReadOnlyCollectionsKt::main);
    }

    @Test
    public void testPlatformTypes() {
        testExample("Appendices/Java Interoperability/Examples/src/PlatformTypes.kt", interop.PlatformTypesKt::main);
    }

    @Test
    public void testKotlinChecked() {
        testExample("Appendices/Java Interoperability/Examples/src/KotlinChecked.kt", KotlinCheckedKt::main);
    }

    @Test
    public void testUsingKotlinClass() {
        testExample("Appendices/Java Interoperability/Examples/src/interoperability/UsingKotlinClass.java", interoperability.UsingKotlinClass::main);
    }

    @Test
    public void testMakeSalad() {
        testExample("Appendices/Java Interoperability/Examples/src/interoperability/MakeSalad.java", interoperability.MakeSalad::main);
    }

    @Test
    public void testJavaWrapper() {
        testExample("Appendices/Java Interoperability/Examples/src/interoperability/JavaWrapper.java", interoperability.JavaWrapper::main);
    }

    @Test
    public void testCallTopLevelFunction() {
        testExample("Appendices/Java Interoperability/Examples/src/interoperability/CallTopLevelFunction.java", interoperability.CallTopLevelFunction::main);
    }

    @Test
    public void testCatchChecked() {
        testExample("Appendices/Java Interoperability/Examples/src/interoperability/CatchChecked.java", interoperability.CatchChecked::main);
    }

    @Test
    public void testJavaChecked() {
        testExample("Appendices/Java Interoperability/Examples/src/interoperability/JavaChecked.java", interoperability.JavaChecked::main);
    }

    @Test
    public void testCallTopLevelFunction2() {
        testExample("Appendices/Java Interoperability/Examples/src/interoperability/CallTopLevelFunction2.java", interoperability.CallTopLevelFunction2::main);
    }

    @Test
    public void testUseDataClass() {
        testExample("Appendices/Java Interoperability/Examples/src/interoperability/UseDataClass.java", interoperability.UseDataClass::main);
    }

    @Test
    public void testHiddenArrayList() {
        testExample("Appendices/Java Interoperability/Examples/src/HiddenArrayList.kt", HiddenArrayListKt::main);
    }

    @Test
    public void testBigFibonacci() {
        testExample("Appendices/Java Interoperability/Examples/src/BigFibonacci.kt", interop.BigFibonacciKt::main);
    }

    @Test
    public void testExtensionsToJavaClass() {
        testExample("Appendices/Java Interoperability/Examples/src/ExtensionsToJavaClass.kt", interop.ExtensionsToJavaClassKt::main);
    }

    @Test
    public void testJavaList() {
        testExample("Appendices/Java Interoperability/Examples/src/JavaList.kt", JavaListKt::main);
    }

    @Test
    public void testUseBeanClass() {
        testExample("Appendices/Java Interoperability/Examples/src/UseBeanClass.kt", UseBeanClassKt::main);
    }

    @Test
    public void testRandom() {
        testExample("Appendices/Java Interoperability/Examples/src/Random.kt", RandomKt::main);
    }

    @Test
    public void testNPEOnPlatformType() {
        testExample("Appendices/Java Interoperability/Examples/src/NPEOnPlatformType.kt", NPEOnPlatformTypeKt::main);
    }

    @Test
    public void testKotlinWrapper() {
        testExample("Appendices/Java Interoperability/Examples/src/KotlinWrapper.kt", interop.KotlinWrapperKt::main);
    }

    @Test
    public void testTask() {
        testExample("Programming Basics/Hello, World/Exercise 2/src/Task.kt", helloWorldExercise2.TaskKt::main);
    }

    @Test
    public void testTask1() {
        testExample("Programming Basics/Hello, World/Exercise 3/src/Task.kt", helloWorldExercise3.TaskKt::main);
    }

    @Test
    public void testTask2() {
        testExample("Programming Basics/var & val/Exercise 1/src/Task.kt", varAndValExercise1.TaskKt::main);
    }

    @Test
    public void testCcc() {
        testExample("Programming Basics/var & val/Exercise 2/src/ccc.kt", varAndValExercise2.CccKt::main);
    }

    @Test
    public void testTask3() {
        testExample("Programming Basics/var & val/Exercise 3/src/Task.kt", varAndValExercise3.TaskKt::main);
    }

    @Test
    public void testTask4() {
        testExample("Programming Basics/Data Types/Exercise 1/src/Task.kt", dataTypesExercise1.TaskKt::main);
    }

    @Test
    public void testTask5() {
        testExample("Programming Basics/Data Types/Exercise 2/src/Task.kt", dataTypesExercise2.TaskKt::main);
    }

    @Test
    public void testTask6() {
        testExample("Programming Basics/Data Types/Exercise 4/src/Task.kt", dataTypesExercise4.TaskKt::main);
    }

    @Test
    public void testTask7() {
        testExample("Programming Basics/Data Types/Exercise 5/src/Task.kt", dataTypesExercise5.TaskKt::main);
    }

    @Test
    public void testTask8() {
        testExample("Programming Basics/Functions/Exercise 1/src/Task.kt", functionsExercise1.TaskKt::main);
    }

    @Test
    public void testTask9() {
        testExample("Programming Basics/Functions/Exercise 2/src/Task.kt", functionsExercise2.TaskKt::main);
    }

    @Test
    public void testTask10() {
        testExample("Programming Basics/Functions/Exercise 3/src/Task.kt", functionsExercise3.TaskKt::main);
    }

    @Test
    public void testTask11() {
        testExample("Programming Basics/Functions/Exercise 4/src/Task.kt", functionsExercise4.TaskKt::main);
    }

    @Test
    public void testTask12() {
        testExample("Programming Basics/if Expressions/Exercise 1/src/Task.kt", ifExpressionsExercise1.TaskKt::main);
    }

    @Test
    public void testTask13() {
        testExample("Programming Basics/if Expressions/Exercise 2/src/Task.kt", ifExpressionsExercise2.TaskKt::main);
    }

    @Test
    public void testTask14() {
        testExample("Programming Basics/if Expressions/Exercise 3/src/Task.kt", ifExpressionsExercise3.TaskKt::main);
    }

    @Test
    public void testTask15() {
        testExample("Programming Basics/if Expressions/Exercise 4/src/Task.kt", ifExpressionsExercise4.TaskKt::main);
    }

    @Test
    public void testTask16() {
        testExample("Programming Basics/String Templates/Exercise 1/src/Task.kt", stringTemplatesExercise1.TaskKt::main);
    }

    @Test
    public void testTask17() {
        testExample("Programming Basics/String Templates/Exercise 2/src/Task.kt", stringTemplatesExercise2.TaskKt::main);
    }

    @Test
    public void testTask18() {
        testExample("Programming Basics/String Templates/Exercise 3/src/Task.kt", stringTemplatesExercise3.TaskKt::main);
    }

    @Test
    public void testTask19() {
        testExample("Programming Basics/String Templates/Exercise 4/src/Task.kt", stringTemplatesExercise4.TaskKt::main);
    }

    @Test
    public void testTask20() {
        testExample("Programming Basics/String Templates/Exercise 5/src/Task.kt", stringTemplatesExercise5.TaskKt::main);
    }

    @Test
    public void testTask21() {
        testExample("Programming Basics/Number Types/Exercise 3/src/Task.kt", numberTypesExercise3.TaskKt::main);
    }

    @Test
    public void testTask22() {
        testExample("Programming Basics/Number Types/Exercise 4/src/Task.kt", numberTypesExercise4.TaskKt::main);
    }

    @Test
    public void testTask23() {
        testExample("Programming Basics/Number Types/Exercise 5/src/Task.kt", numberTypesExercise5.TaskKt::main);
    }

    @Test
    public void testTask24() {
        testExample("Programming Basics/Booleans/Exercise 2/src/Task.kt", booleansExercise2.TaskKt::main);
    }

    @Test
    public void testTask25() {
        testExample("Programming Basics/Booleans/Exercise 3/src/Task.kt", booleansExercise3.TaskKt::main);
    }

    @Test
    public void testTask26() {
        testExample("Programming Basics/Booleans/Exercise 4/src/Task.kt", booleansExercise4.TaskKt::main);
    }

    @Test
    public void testTask27() {
        testExample("Programming Basics/Repetition with while/Exercise 1/src/Task.kt", repetitionWithWhileExercise1.TaskKt::main);
    }

    @Test
    public void testTask28() {
        testExample("Programming Basics/Repetition with while/Exercise 2/src/Task.kt", repetitionWithWhileExercise2.TaskKt::main);
    }

    @Test
    public void testTask29() {
        testExample("Programming Basics/Repetition with while/Exercise 3/src/Task.kt", repetitionWithWhileExercise3.TaskKt::main);
    }

    @Test
    public void testTask30() {
        testExample("Programming Basics/Repetition with while/Exercise 4/src/Task.kt", repetitionWithWhileExercise4.TaskKt::main);
    }

    @Test
    public void testTask31() {
        testExample("Programming Basics/Repetition with while/Exercise 5/src/Task.kt", repetitionWithWhileExercise5.TaskKt::main);
    }

    @Test
    public void testTask32() {
        testExample("Programming Basics/Looping & Ranges/Exercise 1/src/Task.kt", loopingAndRangesExercise1.TaskKt::main);
    }

    @Test
    public void testTask33() {
        testExample("Programming Basics/Looping & Ranges/Exercise 2/src/Task.kt", loopingAndRangesExercise2.TaskKt::main);
    }

    @Test
    public void testTask34() {
        testExample("Programming Basics/Looping & Ranges/Exercise 3/src/Task.kt", loopingAndRangesExercise3.TaskKt::main);
    }

    @Test
    public void testTask35() {
        testExample("Programming Basics/Looping & Ranges/Exercise 4/src/Task.kt", loopingAndRangesExercise4.TaskKt::main);
    }

    @Test
    public void testTask36() {
        testExample("Programming Basics/Looping & Ranges/Exercise 5/src/Task.kt", loopingAndRangesExercise5.TaskKt::main);
    }

    @Test
    public void testTask37() {
        testExample("Programming Basics/The in Keyword/Exercise 1/src/Task.kt", theInKeywordExercise1.TaskKt::main);
    }

    @Test
    public void testTask38() {
        testExample("Programming Basics/The in Keyword/Exercise 2/src/Task.kt", theInKeywordExercise2.TaskKt::main);
    }

    @Test
    public void testTask39() {
        testExample("Programming Basics/The in Keyword/Exercise 3/src/Task.kt", theInKeywordExercise3.TaskKt::main);
    }

    @Test
    public void testTask40() {
        testExample("Programming Basics/The in Keyword/Exercise 4/src/Task.kt", theInKeywordExercise4.TaskKt::main);
    }

    @Test
    public void testTask41() {
        testExample("Programming Basics/Expressions & Statements/Exercise 1/src/Task.kt", expressionsAndStatementsExercise1.TaskKt::main);
    }

    @Test
    public void testTask42() {
        testExample("Programming Basics/Expressions & Statements/Exercise 2/src/Task.kt", expressionsAndStatementsExercise2.TaskKt::main);
    }

    @Test
    public void testTask43() {
        testExample("Programming Basics/Expressions & Statements/Exercise 4/src/Task.kt", expressionsAndStatementsExercise4.TaskKt::main);
    }

    @Test
    public void testTask44() {
        testExample("Programming Basics/Summary 1/Exercise 1/src/Task.kt", summaryIExercise1.TaskKt::main);
    }

    @Test
    public void testTask45() {
        testExample("Programming Basics/Summary 1/Exercise 2/src/Task.kt", summaryIExercise2.TaskKt::main);
    }

    @Test
    public void testTask46() {
        testExample("Programming Basics/Summary 1/Exercise 3/src/Task.kt", summaryIExercise3.TaskKt::main);
    }

    @Test
    public void testTask47() {
        testExample("Programming Basics/Summary 1/Exercise 4/src/Task.kt", summaryIExercise4.TaskKt::main);
    }

    @Test
    public void testTask48() {
        testExample("Programming Basics/Summary 1/Exercise 5/src/Task.kt", summaryIExercise5.TaskKt::main);
    }

    @Test
    public void testTask49() {
        testExample("Programming Basics/Summary 1/Exercise 6/src/Task.kt", summaryIExercise6.TaskKt::main);
    }

    @Test
    public void testTask50() {
        testExample("Programming Basics/Summary 1/Exercise 7/src/Task.kt", summaryIExercise7.TaskKt::main);
    }

    @Test
    public void testTask51() {
        testExample("Programming Basics/Summary 1/Exercise 8/src/Task.kt", summaryIExercise8.TaskKt::main);
    }

    @Test
    public void testTask52() {
        testExample("Programming Basics/Summary 1/Exercise 9/src/Task.kt", summaryIExercise9.TaskKt::main);
    }

    @Test
    public void testTask53() {
        testExample("Programming Basics/Summary 1/Exercise 10/src/Task.kt", summaryIExercise10.TaskKt::main);
    }

    @Test
    public void testTask54() {
        testExample("Introduction to Objects/Objects Everywhere/Exercise 1/src/Task.kt", objectsEverywhereExercise1.TaskKt::main);
    }

    @Test
    public void testTask55() {
        testExample("Introduction to Objects/Objects Everywhere/Exercise 2/src/Task.kt", objectsEverywhereExercise2.TaskKt::main);
    }

    @Test
    public void testTask56() {
        testExample("Introduction to Objects/Objects Everywhere/Exercise 3/src/Task.kt", objectsEverywhereExercise3.TaskKt::main);
    }

    @Test
    public void testTask57() {
        testExample("Introduction to Objects/Objects Everywhere/Exercise 4/src/Task.kt", objectsEverywhereExercise4.TaskKt::main);
    }

    @Test
    public void testTask58() {
        testExample("Introduction to Objects/Objects Everywhere/Exercise 5/src/Task.kt", objectsEverywhereExercise5.TaskKt::main);
    }

    @Test
    public void testTask59() {
        testExample("Introduction to Objects/Creating Classes/Exercise 2/src/Task.kt", creatingClassesExercise2.TaskKt::main);
    }

    @Test
    public void testTask60() {
        testExample("Introduction to Objects/Creating Classes/Exercise 3/src/Task.kt", creatingClassesExercise3.TaskKt::main);
    }

    @Test
    public void testTask61() {
        testExample("Introduction to Objects/Creating Classes/Exercise 4/src/Task.kt", creatingClassesExercise4.TaskKt::main);
    }

    @Test
    public void testTask62() {
        testExample("Introduction to Objects/Creating Classes/Exercise 5/src/Task.kt", creatingClassesExercise5.TaskKt::main);
    }

    @Test
    public void testTask63() {
        testExample("Introduction to Objects/Properties/Exercise 1/src/Task.kt", propertiesExercise1.TaskKt::main);
    }

    @Test
    public void testTask64() {
        testExample("Introduction to Objects/Properties/Exercise 2/src/Task.kt", propertiesExercise2.TaskKt::main);
    }

    @Test
    public void testTask65() {
        testExample("Introduction to Objects/Properties/Exercise 3/src/Task.kt", propertiesExercise3.TaskKt::main);
    }

    @Test
    public void testTask66() {
        testExample("Introduction to Objects/Constructors/Exercise 1/src/Task.kt", constructorsExercise1.TaskKt::main);
    }

    @Test
    public void testTask67() {
        testExample("Introduction to Objects/Constructors/Exercise 2/src/Task.kt", constructorsExercise2.TaskKt::main);
    }

    @Test
    public void testTask68() {
        testExample("Introduction to Objects/Constructors/Exercise 3/src/Task.kt", constructorsExercise3.TaskKt::main);
    }

    @Test
    public void testTask69() {
        testExample("Introduction to Objects/Constructors/Exercise 4/src/Task.kt", constructorsExercise4.TaskKt::main);
    }

    @Test
    public void testTask70() {
        testExample("Introduction to Objects/Constraining Visibility/Exercise 1/src/Task.kt", constrainingVisibilityExercise1.TaskKt::main);
    }

    @Test
    public void testTask71() {
        testExample("Introduction to Objects/Constraining Visibility/Exercise 2/src/Task.kt", constrainingVisibilityExercise2.TaskKt::main);
    }

    @Test
    public void testTask72() {
        testExample("Introduction to Objects/Constraining Visibility/Exercise 3/src/Task.kt", constrainingVisibilityExercise3.TaskKt::main);
    }

    @Test
    public void testTask73() {
        testExample("Introduction to Objects/Constraining Visibility/Exercise 4/src/Task.kt", constrainingVisibilityExercise4.TaskKt::main);
    }

    @Test
    public void testTask74() {
        testExample("Introduction to Objects/Constraining Visibility/Exercise 5/src/Task.kt", constrainingVisibilityExercise5.TaskKt::main);
    }

    @Test
    public void testTask75() {
        testExample("Introduction to Objects/Packages/Exercise 1/src/Task.kt", packagesExercise1.TaskKt::main);
    }

    @Test
    public void testTask76() {
        testExample("Introduction to Objects/Packages/Exercise 2/src/Task.kt", ccc.TaskKt::main);
    }

    @Test
    public void testTask77() {
        testExample("Introduction to Objects/Packages/Exercise 3/src/Task.kt", packagesExercise3.TaskKt::main);
    }

    @Test
    public void testTask78() {
        testExample("Introduction to Objects/Packages/Exercise 4/src/Task.kt", packagesExercise4.TaskKt::main);
    }

    @Test
    public void testTask79() {
        testExample("Introduction to Objects/Testing/Exercise 1/src/Task.kt", testingExercise1.TaskKt::main);
    }

    @Test
    public void testTask80() {
        testExample("Introduction to Objects/Testing/Exercise 2/src/Task.kt", testingExercise2.TaskKt::main);
    }

    @Test
    public void testTask81() {
        testExample("Introduction to Objects/Testing/Exercise 3/src/Task.kt", testingExercise3.TaskKt::main);
    }

    @Test
    public void testTask82() {
        testExample("Introduction to Objects/Testing/Exercise 4/src/Task.kt", testingExercise4.TaskKt::main);
    }

    @Test
    public void testTask83() {
        testExample("Introduction to Objects/Exceptions/Exercise 1/src/Task.kt", exceptionsExercise1.TaskKt::main);
    }

    @Test
    public void testTask84() {
        testExample("Introduction to Objects/Exceptions/Exercise 2/src/Task.kt", exceptionsExercise2.TaskKt::main);
    }

    @Test
    public void testTask85() {
        testExample("Introduction to Objects/Exceptions/Exercise 3/src/Task.kt", exceptionsExercise3.TaskKt::main);
    }

    @Test
    public void testTask86() {
        testExample("Introduction to Objects/Lists/Exercise 1/src/Task.kt", listsExercise1.TaskKt::main);
    }

    @Test
    public void testTask87() {
        testExample("Introduction to Objects/Lists/Exercise 2/src/Task.kt", listsExercise2.TaskKt::main);
    }

    @Test
    public void testTask88() {
        testExample("Introduction to Objects/Lists/Exercise 3/src/Task.kt", listsExercise3.TaskKt::main);
    }

    @Test
    public void testTask89() {
        testExample("Introduction to Objects/Lists/Exercise 4/src/Task.kt", listsExercise4.TaskKt::main);
    }

    @Test
    public void testTask90() {
        testExample("Introduction to Objects/Variable Argument Lists/Exercise 1/src/Task.kt", variableArgumentListsExercise1.TaskKt::main);
    }

    @Test
    public void testTask91() {
        testExample("Introduction to Objects/Variable Argument Lists/Exercise 2/src/Task.kt", variableArgumentListsExercise2.TaskKt::main);
    }

    @Test
    public void testTask92() {
        testExample("Introduction to Objects/Variable Argument Lists/Exercise 3/src/Task.kt", variableArgumentListsExercise3.TaskKt::main);
    }

    @Test
    public void testTask93() {
        testExample("Introduction to Objects/Variable Argument Lists/Exercise 4/src/Task.kt", variableArgumentListsExercise4.TaskKt::main);
    }

    @Test
    public void testTask94() {
        testExample("Introduction to Objects/Sets/Exercise 1/src/Task.kt", setsExercise1.TaskKt::main);
    }

    @Test
    public void testTask95() {
        testExample("Introduction to Objects/Sets/Exercise 2/src/Task.kt", setsExercise2.TaskKt::main);
    }

    @Test
    public void testTask96() {
        testExample("Introduction to Objects/Sets/Exercise 3/src/Task.kt", setsExercise3.TaskKt::main);
    }

    @Test
    public void testTask97() {
        testExample("Introduction to Objects/Sets/Exercise 4/src/Task.kt", setsExercise4.TaskKt::main);
    }

    @Test
    public void testTask98() {
        testExample("Introduction to Objects/Maps/Exercise 1/src/Task.kt", mapsExercise1.TaskKt::main);
    }

    @Test
    public void testTask99() {
        testExample("Introduction to Objects/Maps/Exercise 2/src/Task.kt", mapsExercise2.TaskKt::main);
    }

    @Test
    public void testTask100() {
        testExample("Introduction to Objects/Maps/Exercise 3/src/Task.kt", mapsExercise3.TaskKt::main);
    }

    @Test
    public void testTask101() {
        testExample("Introduction to Objects/Maps/Exercise 4/src/Task.kt", mapsExercise4.TaskKt::main);
    }

    @Test
    public void testTask102() {
        testExample("Introduction to Objects/Property Accessors/Exercise 1/src/Task.kt", propertyAccessorsExercise1.TaskKt::main);
    }

    @Test
    public void testTask103() {
        testExample("Introduction to Objects/Property Accessors/Exercise 2/src/Task.kt", propertyAccessorsExercise2.TaskKt::main);
    }

    @Test
    public void testTask104() {
        testExample("Introduction to Objects/Property Accessors/Exercise 3/src/Task.kt", propertyAccessorsExercise3.TaskKt::main);
    }

    @Test
    public void testTask105() {
        testExample("Introduction to Objects/Property Accessors/Exercise 4/src/Task.kt", propertyAccessorsExercise4.TaskKt::main);
    }

    @Test
    public void testTask106() {
        testExample("Introduction to Objects/Property Accessors/Exercise 5/src/Task.kt", propertyAccessorsExercise5.TaskKt::main);
    }

    @Test
    public void testTask107() {
        testExample("Introduction to Objects/Summary 2/Exercise 1/src/Task.kt", summaryIIExercise1.TaskKt::main);
    }

    @Test
    public void testTask108() {
        testExample("Introduction to Objects/Summary 2/Exercise 2/src/Task.kt", summaryIIExercise2.TaskKt::main);
    }

    @Test
    public void testTask109() {
        testExample("Introduction to Objects/Summary 2/Exercise 3/src/Task.kt", summaryIIExercise3.TaskKt::main);
    }

    @Test
    public void testTask110() {
        testExample("Introduction to Objects/Summary 2/Exercise 4/src/Task.kt", summaryIIExercise4.TaskKt::main);
    }

    @Test
    public void testTask111() {
        testExample("Introduction to Objects/Summary 2/Exercise 5/src/Task.kt", summaryIIExercise5.TaskKt::main);
    }

    @Test
    public void testTask112() {
        testExample("Introduction to Objects/Summary 2/Exercise 6/src/Task.kt", summaryIIExercise6.TaskKt::main);
    }

    @Test
    public void testTask113() {
        testExample("Introduction to Objects/Summary 2/Exercise 7/src/Task.kt", summaryIIExercise7.TaskKt::main);
    }

    @Test
    public void testTask114() {
        testExample("Introduction to Objects/Summary 2/Exercise 8/src/Task.kt", summaryIIExercise8.TaskKt::main);
    }

    @Test
    public void testTask115() {
        testExample("Usability/Extension Functions/Exercise 1/src/Task.kt", extensionFunctionsExercise1.TaskKt::main);
    }

    @Test
    public void testTask116() {
        testExample("Usability/Extension Functions/Exercise 2/src/Task.kt", extensionFunctionsExercise2.TaskKt::main);
    }

    @Test
    public void testTask117() {
        testExample("Usability/Extension Functions/Exercise 3/src/Task.kt", extensionFunctionsExercise3.TaskKt::main);
    }

    @Test
    public void testTask118() {
        testExample("Usability/Extension Functions/Exercise 4/src/Task.kt", extensionFunctionsExercise4.TaskKt::main);
    }

    @Test
    public void testTask119() {
        testExample("Usability/Named & Default Arguments/Exercise 1/src/Task.kt", namedAndDefaultArgumentsExercise1.TaskKt::main);
    }

    @Test
    public void testTask120() {
        testExample("Usability/Named & Default Arguments/Exercise 2/src/Task.kt", namedAndDefaultArgumentsExercise2.TaskKt::main);
    }

    @Test
    public void testTask121() {
        testExample("Usability/Named & Default Arguments/Exercise 3/src/Task.kt", namedAndDefaultArgumentsExercise3.TaskKt::main);
    }

    @Test
    public void testTask122() {
        testExample("Usability/Named & Default Arguments/Exercise 4/src/Task.kt", namedAndDefaultArgumentsExercise4.TaskKt::main);
    }

    @Test
    public void testTask123() {
        testExample("Usability/Overloading/Exercise 1/src/Task.kt", overloadingExercise1.TaskKt::main);
    }

    @Test
    public void testTask124() {
        testExample("Usability/Overloading/Exercise 2/src/Task.kt", overloadingExercise2.TaskKt::main);
    }

    @Test
    public void testTask125() {
        testExample("Usability/Overloading/Exercise 3/src/Task.kt", overloadingExercise3.TaskKt::main);
    }

    @Test
    public void testTask126() {
        testExample("Usability/Overloading/Exercise 4/src/Task.kt", overloadingExercise4.TaskKt::main);
    }

    @Test
    public void testTask127() {
        testExample("Usability/when Expressions/Exercise 1/src/Task.kt", whenExpressionsExercise1.TaskKt::main);
    }

    @Test
    public void testTask128() {
        testExample("Usability/when Expressions/Exercise 2/src/Task.kt", whenExpressionsExercise2.TaskKt::main);
    }

    @Test
    public void testTask129() {
        testExample("Usability/when Expressions/Exercise 3/src/Task.kt", whenExpressionsExercise3.TaskKt::main);
    }

    @Test
    public void testTask130() {
        testExample("Usability/when Expressions/Exercise 4/src/Task.kt", whenExpressionsExercise4.TaskKt::main);
    }

    @Test
    public void testTask131() {
        testExample("Usability/Enumerations/Exercise 1/src/Task.kt", enumerationsExercise1.TaskKt::main);
    }

    @Test
    public void testTask132() {
        testExample("Usability/Enumerations/Exercise 2/src/Task.kt", enumerationsExercise2.TaskKt::main);
    }

    @Test
    public void testTask133() {
        testExample("Usability/Enumerations/Exercise 3/src/Task.kt", enumerationsExercise3.TaskKt::main);
    }

    @Test
    public void testTask134() {
        testExample("Usability/Data Classes/Exercise 1/src/Task.kt", dataClassesExercise1.TaskKt::main);
    }

    @Test
    public void testTask135() {
        testExample("Usability/Data Classes/Exercise 2/src/Task.kt", dataClassesExercise2.TaskKt::main);
    }

    @Test
    public void testTask136() {
        testExample("Usability/Data Classes/Exercise 3/src/Task.kt", dataClassesExercise3.TaskKt::main);
    }

    @Test
    public void testTask137() {
        testExample("Usability/Destructuring Declarations/Exercise 1/src/Task.kt", destructuringDeclarationsExercise1.TaskKt::main);
    }

    @Test
    public void testTask138() {
        testExample("Usability/Destructuring Declarations/Exercise 2/src/Task.kt", destructuringDeclarationsExercise2.TaskKt::main);
    }

    @Test
    public void testTask139() {
        testExample("Usability/Destructuring Declarations/Exercise 3/src/Task.kt", destructuringDeclarationsExercise3.TaskKt::main);
    }

    @Test
    public void testTask140() {
        testExample("Usability/Nullable Types/Exercise 1/src/Task.kt", nullableTypesExercise1.TaskKt::main);
    }

    @Test
    public void testTask141() {
        testExample("Usability/Nullable Types/Exercise 2/src/Task.kt", nullableTypesExercise2.TaskKt::main);
    }

    @Test
    public void testTask142() {
        testExample("Usability/Nullable Types/Exercise 3/src/Task.kt", nullableTypesExercise3.TaskKt::main);
    }

    @Test
    public void testTask143() {
        testExample("Usability/Safe Calls & the Elvis Operator/Exercise 1/src/Task.kt", safeCallsAndTheElvisOperatorExercise1.TaskKt::main);
    }

    @Test
    public void testTask144() {
        testExample("Usability/Safe Calls & the Elvis Operator/Exercise 2/src/Task.kt", safeCallsAndTheElvisOperatorExercise2.TaskKt::main);
    }

    @Test
    public void testTask145() {
        testExample("Usability/Safe Calls & the Elvis Operator/Exercise 3/src/Task.kt", safeCallsAndTheElvisOperatorExercise3.TaskKt::main);
    }

    @Test
    public void testTask146() {
        testExample("Usability/Non-Null Assertions/Exercise 1/src/Task.kt", nonNullAssertionsExercise1.TaskKt::main);
    }

    @Test
    public void testTask147() {
        testExample("Usability/Non-Null Assertions/Exercise 2/src/Task.kt", nonNullAssertionsExercise2.TaskKt::main);
    }

    @Test
    public void testTask148() {
        testExample("Usability/Non-Null Assertions/Exercise 3/src/Task.kt", nonNullAssertionsExercise3.TaskKt::main);
    }

    @Test
    public void testTask149() {
        testExample("Usability/Extensions for Nullable Types/Exercise 1/src/Task.kt", extensionsForNullableTypesExercise1.TaskKt::main);
    }

    @Test
    public void testTask150() {
        testExample("Usability/Extensions for Nullable Types/Exercise 2/src/Task.kt", extensionsForNullableTypesExercise2.TaskKt::main);
    }

    @Test
    public void testTask151() {
        testExample("Usability/Extensions for Nullable Types/Exercise 3/src/Task.kt", extensionsForNullableTypesExercise3.TaskKt::main);
    }

    @Test
    public void testTask152() {
        testExample("Usability/Introduction to Generics/Exercise 1/src/Task.kt", introductionToGenericsExercise1.TaskKt::main);
    }

    @Test
    public void testTask153() {
        testExample("Usability/Introduction to Generics/Exercise 2/src/Task.kt", introductionToGenericsExercise2.TaskKt::main);
    }

    @Test
    public void testTask154() {
        testExample("Usability/Introduction to Generics/Exercise 3/src/Task.kt", introductionToGenericsExercise3.TaskKt::main);
    }

    @Test
    public void testTask155() {
        testExample("Usability/Extension Properties/Exercise 1/src/Task.kt", extensionPropertiesExercise1.TaskKt::main);
    }

    @Test
    public void testTask156() {
        testExample("Usability/Extension Properties/Exercise 2/src/Task.kt", extensionPropertiesExercise2.TaskKt::main);
    }

    @Test
    public void testTask157() {
        testExample("Usability/Extension Properties/Exercise 3/src/Task.kt", extensionPropertiesExercise3.TaskKt::main);
    }

    @Test
    public void testTask158() {
        testExample("Usability/break & continue/Exercise 1/src/Task.kt", breakAndContinueExercise1.TaskKt::main);
    }

    @Test
    public void testTask159() {
        testExample("Usability/break & continue/Exercise 2/src/Task.kt", breakAndContinueExercise2.TaskKt::main);
    }

    @Test
    public void testTask160() {
        testExample("Usability/break & continue/Exercise 3/src/Task.kt", breakAndContinueExercise3.TaskKt::main);
    }

    @Test
    public void testTask161() {
        testExample("Functional Programming/Lambdas/Exercise 1/src/Task.kt", lambdasExercise1.TaskKt::main);
    }

    @Test
    public void testTask162() {
        testExample("Functional Programming/Lambdas/Exercise 2/src/Task.kt", lambdasExercise2.TaskKt::main);
    }

    @Test
    public void testTask163() {
        testExample("Functional Programming/Lambdas/Exercise 3/src/Task.kt", lambdasExercise3.TaskKt::main);
    }

    @Test
    public void testTask164() {
        testExample("Functional Programming/The Importance of Lambdas/Exercise 1/src/Task.kt", theImportanceOfLambdasExercise1.TaskKt::main);
    }

    @Test
    public void testTask165() {
        testExample("Functional Programming/The Importance of Lambdas/Exercise 2/src/Task.kt", theImportanceOfLambdasExercise2.TaskKt::main);
    }

    @Test
    public void testTask166() {
        testExample("Functional Programming/The Importance of Lambdas/Exercise 3/src/Task.kt", theImportanceOfLambdasExercise3.TaskKt::main);
    }

    @Test
    public void testTask167() {
        testExample("Functional Programming/Operations on Collections/Exercise 1/src/Task.kt", operationsOnCollectionsExercise1.TaskKt::main);
    }

    @Test
    public void testTask168() {
        testExample("Functional Programming/Operations on Collections/Exercise 2/src/Task.kt", operationsOnCollectionsExercise2.TaskKt::main);
    }

    @Test
    public void testTask169() {
        testExample("Functional Programming/Operations on Collections/Exercise 3/src/Task.kt", operationsOnCollectionsExercise3.TaskKt::main);
    }

    @Test
    public void testTask170() {
        testExample("Functional Programming/Operations on Collections/Exercise 4/src/Task.kt", operationsOnCollectionsExercise4.TaskKt::main);
    }

    @Test
    public void testTask171() {
        testExample("Functional Programming/Member References/Exercise 1/src/Task.kt", memberReferencesExercise1.TaskKt::main);
    }

    @Test
    public void testTask172() {
        testExample("Functional Programming/Member References/Exercise 2/src/Task.kt", memberReferencesExercise2.TaskKt::main);
    }

    @Test
    public void testTask173() {
        testExample("Functional Programming/Member References/Exercise 3/src/Task.kt", memberReferencesExercise3.TaskKt::main);
    }

    @Test
    public void testTask174() {
        testExample("Functional Programming/Higher-Order Functions/Exercise 1/src/Task.kt", higherOrderFunctionsExercise1.TaskKt::main);
    }

    @Test
    public void testTask175() {
        testExample("Functional Programming/Higher-Order Functions/Exercise 2/src/Task.kt", higherOrderFunctionsExercise2.TaskKt::main);
    }

    @Test
    public void testTask176() {
        testExample("Functional Programming/Higher-Order Functions/Exercise 3/src/Task.kt", higherOrderFunctionsExercise3.TaskKt::main);
    }

    @Test
    public void testTask177() {
        testExample("Functional Programming/Higher-Order Functions/Exercise 4/src/Task.kt", higherOrderFunctionsExercise4.TaskKt::main);
    }

    @Test
    public void testTask178() {
        testExample("Functional Programming/Manipulating Lists/Exercise 1/src/Task.kt", manipulatingListsExercise1.TaskKt::main);
    }

    @Test
    public void testTask179() {
        testExample("Functional Programming/Manipulating Lists/Exercise 2/src/Task.kt", manipulatingListsExercise2.TaskKt::main);
    }

    @Test
    public void testTask180() {
        testExample("Functional Programming/Manipulating Lists/Exercise 3/src/Task.kt", manipulatingListsExercise3.TaskKt::main);
    }

    @Test
    public void testTask181() {
        testExample("Functional Programming/Manipulating Lists/Exercise 4/src/Task.kt", manipulatingListsExercise4.TaskKt::main);
    }

    @Test
    public void testTask182() {
        testExample("Functional Programming/Manipulating Lists/Exercise 5/src/Task.kt", manipulatingListsExercise5.TaskKt::main);
    }

    @Test
    public void testTask183() {
        testExample("Functional Programming/Manipulating Lists/Exercise 6/src/Task.kt", manipulatingListsExercise6.TaskKt::main);
    }

    @Test
    public void testTask184() {
        testExample("Functional Programming/Manipulating Lists/Exercise 7/src/Task.kt", manipulatingListsExercise7.TaskKt::main);
    }

    @Test
    public void testTask185() {
        testExample("Functional Programming/Building Maps/Exercise 1/src/Task.kt", buildingMapsExercise1.TaskKt::main);
    }

    @Test
    public void testTask186() {
        testExample("Functional Programming/Building Maps/Exercise 2/src/Task.kt", buildingMapsExercise2.TaskKt::main);
    }

    @Test
    public void testTask187() {
        testExample("Functional Programming/Building Maps/Exercise 3/src/Task.kt", buildingMapsExercise3.TaskKt::main);
    }

    @Test
    public void testTask188() {
        testExample("Functional Programming/Sequences/Exercise 6/src/Task.kt", sequencesExercise6.TaskKt::main);
    }

    @Test
    public void testTask189() {
        testExample("Functional Programming/Sequences/Exercise 7/src/Task.kt", sequencesExercise7.TaskKt::main);
    }

    @Test
    public void testTask190() {
        testExample("Functional Programming/Sequences/Exercise 8/src/Task.kt", sequencesExercise8.TaskKt::main);
    }

    @Test
    public void testTask191() {
        testExample("Functional Programming/Local Functions/Exercise 1/src/Task.kt", localFunctionsExercise1.TaskKt::main);
    }

    @Test
    public void testTask192() {
        testExample("Functional Programming/Local Functions/Exercise 2/src/Task.kt", localFunctionsExercise2.TaskKt::main);
    }

    @Test
    public void testTask193() {
        testExample("Functional Programming/Local Functions/Exercise 3/src/Task.kt", localFunctionsExercise3.TaskKt::main);
    }

    @Test
    public void testTask194() {
        testExample("Functional Programming/Folding Lists/Exercise 1/src/Task.kt", foldingListsExercise1.TaskKt::main);
    }

    @Test
    public void testTask195() {
        testExample("Functional Programming/Folding Lists/Exercise 2/src/Task.kt", foldingListsExercise2.TaskKt::main);
    }

    @Test
    public void testTask196() {
        testExample("Functional Programming/Folding Lists/Exercise 3/src/Task.kt", foldingListsExercise3.TaskKt::main);
    }

    @Test
    public void testTask197() {
        testExample("Functional Programming/Folding Lists/Exercise 4/src/Task.kt", foldingListsExercise4.TaskKt::main);
    }

    @Test
    public void testTask198() {
        testExample("Functional Programming/Recursion/Exercise 1/src/Task.kt", recursionExercise1.TaskKt::main);
    }

    @Test
    public void testTask199() {
        testExample("Functional Programming/Recursion/Exercise 2/src/Task.kt", recursionExercise2.TaskKt::main);
    }

    @Test
    public void testTask200() {
        testExample("Functional Programming/Recursion/Exercise 3/src/Task.kt", recursionExercise3.TaskKt::main);
    }

    @Test
    public void testTask201() {
        testExample("Functional Programming/Recursion/Exercise 4/src/Task.kt", recursionExercise4.TaskKt::main);
    }

    @Test
    public void testTask202() {
        testExample("Object-Oriented Programming/Interfaces/Exercise 1/src/Task.kt", interfacesExercise1.TaskKt::main);
    }

    @Test
    public void testTask203() {
        testExample("Object-Oriented Programming/Interfaces/Exercise 2/src/Task.kt", interfacesExercise2.TaskKt::main);
    }

    @Test
    public void testTask204() {
        testExample("Object-Oriented Programming/Interfaces/Exercise 3/src/Task.kt", interfacesExercise3.TaskKt::main);
    }

    @Test
    public void testTask205() {
        testExample("Object-Oriented Programming/Complex Constructors/Exercise 1/src/Task.kt", complexConstructorsExercise1.TaskKt::main);
    }

    @Test
    public void testTask206() {
        testExample("Object-Oriented Programming/Complex Constructors/Exercise 2/src/Task.kt", complexConstructorsExercise2.TaskKt::main);
    }

    @Test
    public void testTask207() {
        testExample("Object-Oriented Programming/Complex Constructors/Exercise 3/src/Task.kt", complexConstructorsExercise3.TaskKt::main);
    }

    @Test
    public void testTask208() {
        testExample("Object-Oriented Programming/Secondary Constructors/Exercise 1/src/Task.kt", secondaryConstructorsExercise1.TaskKt::main);
    }

    @Test
    public void testTask209() {
        testExample("Object-Oriented Programming/Secondary Constructors/Exercise 2/src/Task.kt", secondaryConstructorsExercise2.TaskKt::main);
    }

    @Test
    public void testGardenItem1() {
        testExample("Object-Oriented Programming/Secondary Constructors/Exercise 3/src/GardenItem.kt", secondaryConstructorsExercise3.GardenItemKt::main);
    }

    @Test
    public void testTask210() {
        testExample("Object-Oriented Programming/Inheritance/Exercise 1/src/Task.kt", inheritanceExercise1.TaskKt::main);
    }

    @Test
    public void testTask211() {
        testExample("Object-Oriented Programming/Inheritance/Exercise 2/src/Task.kt", inheritanceExercise2.TaskKt::main);
    }

    @Test
    public void testTask212() {
        testExample("Object-Oriented Programming/Inheritance/Exercise 3/src/Task.kt", inheritanceExercise3.TaskKt::main);
    }

    @Test
    public void testTask213() {
        testExample("Object-Oriented Programming/Base Class Initialization/Exercise 2/src/Task.kt", baseClassInitializationExercise2.TaskKt::main);
    }

    @Test
    public void testTask214() {
        testExample("Object-Oriented Programming/Base Class Initialization/Exercise 3/src/Task.kt", baseClassInitializationExercise3.TaskKt::main);
    }

    @Test
    public void testTask215() {
        testExample("Object-Oriented Programming/Abstract Classes/Exercise 1/src/Task.kt", abstractClassesExercise1.TaskKt::main);
    }

    @Test
    public void testTask216() {
        testExample("Object-Oriented Programming/Abstract Classes/Exercise 2/src/Task.kt", abstractClassesExercise2.TaskKt::main);
    }

    @Test
    public void testTask217() {
        testExample("Object-Oriented Programming/Abstract Classes/Exercise 3/src/Task.kt", abstractClassesExercise3.TaskKt::main);
    }

    @Test
    public void testTask218() {
        testExample("Object-Oriented Programming/Upcasting/Exercise 1/src/Task.kt", upcastingExercise1.TaskKt::main);
    }

    @Test
    public void testTask219() {
        testExample("Object-Oriented Programming/Upcasting/Exercise 2/src/Task.kt", upcastingExercise2.TaskKt::main);
    }

    @Test
    public void testTask220() {
        testExample("Object-Oriented Programming/Upcasting/Exercise 3/src/Task.kt", upcastingExercise3.TaskKt::main);
    }

    @Test
    public void testTask221() {
        testExample("Object-Oriented Programming/Polymorphism/Exercise 1/src/Task.kt", polymorphismExercise1.TaskKt::main);
    }

    @Test
    public void testTask222() {
        testExample("Object-Oriented Programming/Polymorphism/Exercise 2/src/Task.kt", polymorphismExercise2.TaskKt::main);
    }

    @Test
    public void testTask223() {
        testExample("Object-Oriented Programming/Composition/Exercise 1/src/Task.kt", compositionExercise1.TaskKt::main);
    }

    @Test
    public void testTask224() {
        testExample("Object-Oriented Programming/Composition/Exercise 2/src/Task.kt", compositionExercise2.TaskKt::main);
    }

    @Test
    public void testTask225() {
        testExample("Object-Oriented Programming/Composition/Exercise 3/src/Task.kt", compositionExercise3.TaskKt::main);
    }

    @Test
    public void testTask226() {
        testExample("Object-Oriented Programming/Inheritance & Extensions/Exercise 1/src/Task.kt", inheritanceAndExtensionsExercise1.TaskKt::main);
    }

    @Test
    public void testTask227() {
        testExample("Object-Oriented Programming/Inheritance & Extensions/Exercise 2/src/Task.kt", inheritanceAndExtensionsExercise2.TaskKt::main);
    }

    @Test
    public void testTask228() {
        testExample("Object-Oriented Programming/Class Delegation/Exercise 1/src/Task.kt", classDelegationExercise1.TaskKt::main);
    }

    @Test
    public void testTask229() {
        testExample("Object-Oriented Programming/Class Delegation/Exercise 2/src/Task.kt", classDelegationExercise2.TaskKt::main);
    }

    @Test
    public void testTask230() {
        testExample("Object-Oriented Programming/Class Delegation/Exercise 3/src/Task.kt", classDelegationExercise3.TaskKt::main);
    }

    @Test
    public void testTask231() {
        testExample("Object-Oriented Programming/Downcasting/Exercise 1/src/Task.kt", downcastingExercise1.TaskKt::main);
    }

    @Test
    public void testTask232() {
        testExample("Object-Oriented Programming/Downcasting/Exercise 2/src/Task.kt", downcastingExercise2.TaskKt::main);
    }

    @Test
    public void testTask233() {
        testExample("Object-Oriented Programming/Downcasting/Exercise 3/src/Task.kt", downcastingExercise3.TaskKt::main);
    }

    @Test
    public void testTask234() {
        testExample("Object-Oriented Programming/Sealed Classes/Exercise 1/src/Task.kt", sealedClassesExercise1.TaskKt::main);
    }

    @Test
    public void testTask235() {
        testExample("Object-Oriented Programming/Sealed Classes/Exercise 2/src/Task.kt", sealedClassesExercise2.TaskKt::main);
    }

    @Test
    public void testTask236() {
        testExample("Object-Oriented Programming/Sealed Classes/Exercise 3/src/Task.kt", sealedClassesExercise3.TaskKt::main);
    }

    @Test
    public void testTask237() {
        testExample("Object-Oriented Programming/Type Checking/Exercise 1/src/Task.kt", typeCheckingExercise1.TaskKt::main);
    }

    @Test
    public void testTaskA() {
        testExample("Object-Oriented Programming/Type Checking/Exercise 2/src/TaskA.kt", typeCheckingExercise2a.TaskAKt::main);
    }

    @Test
    public void testTaskB() {
        testExample("Object-Oriented Programming/Type Checking/Exercise 2/src/TaskB.kt", typeCheckingExercise2b.TaskBKt::main);
    }

    @Test
    public void testTask238() {
        testExample("Object-Oriented Programming/Type Checking/Exercise 3/src/Task.kt", typeCheckingExercise3.TaskKt::main);
    }

    @Test
    public void testTask239() {
        testExample("Object-Oriented Programming/Nested Classes/Exercise 1/src/Task.kt", nestedClassesExercise1.TaskKt::main);
    }

    @Test
    public void testTask240() {
        testExample("Object-Oriented Programming/Nested Classes/Exercise 2/src/Task.kt", nestedClassesExercise2.TaskKt::main);
    }

    @Test
    public void testTask241() {
        testExample("Object-Oriented Programming/Nested Classes/Exercise 3/src/Task.kt", nestedClassesExercise3.TaskKt::main);
    }

    @Test
    public void testTask242() {
        testExample("Object-Oriented Programming/Nested Classes/Exercise 4/src/Task.kt", nestedClassesExercise4.TaskKt::main);
    }

    @Test
    public void testTask243() {
        testExample("Object-Oriented Programming/Objects/Exercise 1/src/Task.kt", objectsExercise1.TaskKt::main);
    }

    @Test
    public void testTask244() {
        testExample("Object-Oriented Programming/Objects/Exercise 2/src/Task.kt", objectsExercise2.TaskKt::main);
    }

    @Test
    public void testTask245() {
        testExample("Object-Oriented Programming/Objects/Exercise 3/src/Task.kt", objectsExercise3.TaskKt::main);
    }

    @Test
    public void testTask246() {
        testExample("Object-Oriented Programming/Inner Classes/Exercise 1/src/Task.kt", innerClassesExercise1.TaskKt::main);
    }

    @Test
    public void testTask247() {
        testExample("Object-Oriented Programming/Inner Classes/Exercise 2/src/Task.kt", innerClassesExercise2.TaskKt::main);
    }

    @Test
    public void testTask248() {
        testExample("Object-Oriented Programming/Inner Classes/Exercise 3/src/Task.kt", innerClassesExercise3.TaskKt::main);
    }

    @Test
    public void testTask249() {
        testExample("Object-Oriented Programming/Companion Objects/Exercise 1/src/Task.kt", companionObjectsExercise1.TaskKt::main);
    }

    @Test
    public void testTask250() {
        testExample("Object-Oriented Programming/Companion Objects/Exercise 2/src/Task.kt", companionObjectsExercise2.TaskKt::main);
    }

    @Test
    public void testTask251() {
        testExample("Object-Oriented Programming/Companion Objects/Exercise 3/src/Task.kt", companionObjectsExercise3.TaskKt::main);
    }

    @Test
    public void testTask252() {
        testExample("Preventing Failure/Exception Handling/Exercise 1/src/Task.kt", exceptionHandlingExercise1.TaskKt::main);
    }

    @Test
    public void testTask253() {
        testExample("Preventing Failure/Exception Handling/Exercise 2/src/Task.kt", exceptionHandlingExercise2.TaskKt::main);
    }

    @Test
    public void testTask254() {
        testExample("Preventing Failure/Exception Handling/Exercise 3/src/Task.kt", exceptionHandlingExercise3.TaskKt::main);
    }

    @Test
    public void testTask255() {
        testExample("Preventing Failure/Check Instructions/Exercise 1/src/Task.kt", checkInstructionsExercise1.TaskKt::main);
    }

    @Test
    public void testTask256() {
        testExample("Preventing Failure/Check Instructions/Exercise 2/src/Task.kt", checkInstructionsExercise2.TaskKt::main);
    }

    @Test
    public void testTask257() {
        testExample("Preventing Failure/Check Instructions/Exercise 3/src/Task.kt", checkInstructionsExercise3.TaskKt::main);
    }

    @Test
    public void testTask258() {
        testExample("Preventing Failure/The Nothing Type/Exercise 1/src/Task.kt", theNothingTypeExercise1.TaskKt::main);
    }

    @Test
    public void testTask259() {
        testExample("Preventing Failure/The Nothing Type/Exercise 2/src/Task.kt", theNothingTypeExercise2.TaskKt::main);
    }

    @Test
    public void testTask260() {
        testExample("Preventing Failure/The Nothing Type/Exercise 3/src/Task.kt", theNothingTypeExercise3.TaskKt::main);
    }

    @Test
    public void testTask261() {
        testExample("Preventing Failure/Resource Cleanup/Exercise 1/src/Task.kt", resourceCleanupExercise1.TaskKt::main);
    }

    @Test
    public void testTask262() {
        testExample("Preventing Failure/Resource Cleanup/Exercise 2/src/Task.kt", resourceCleanupExercise2.TaskKt::main);
    }

    @Test
    public void testTask263() {
        testExample("Preventing Failure/Resource Cleanup/Exercise 3/src/Task.kt", resourceCleanupExercise3.TaskKt::main);
    }

    @Test
    public void testTask264() {
        testExample("Preventing Failure/Logging/Exercise 1/src/Task.kt", loggingExercise1.TaskKt::main);
    }

    @Test
    public void testTask265() {
        testExample("Preventing Failure/Logging/Exercise 2/src/Task.kt", loggingExercise2.TaskKt::main);
    }

    @Test
    public void testTask266() {
        testExample("Preventing Failure/Logging/Exercise 3/src/Task.kt", loggingExercise3.TaskKt::main);
    }

    @Test
    public void testTask267() {
        testExample("Power Tools/Extension Lambdas/Exercise 1/src/Task.kt", extensionLambdasExercise1.TaskKt::main);
    }

    @Test
    public void testTask268() {
        testExample("Power Tools/Extension Lambdas/Exercise 2/src/Task.kt", extensionLambdasExercise2.TaskKt::main);
    }

    @Test
    public void testTask269() {
        testExample("Power Tools/Extension Lambdas/Exercise 3/src/Task.kt", extensionLambdasExercise3.TaskKt::main);
    }

    @Test
    public void testTask270() {
        testExample("Power Tools/Scope Functions/Exercise 1/src/Task.kt", scopeFunctionsExercise1.TaskKt::main);
    }

    @Test
    public void testTask271() {
        testExample("Power Tools/Scope Functions/Exercise 2/src/Task.kt", scopeFunctionsExercise2.TaskKt::main);
    }

    @Test
    public void testTask272() {
        testExample("Power Tools/Scope Functions/Exercise 3/src/Task.kt", scopeFunctionsExercise3.TaskKt::main);
    }

    @Test
    public void testTask273() {
        testExample("Power Tools/Creating Generics/Exercise 1/src/Task.kt", creatingGenericsExercise1.TaskKt::main);
    }

    @Test
    public void testTask274() {
        testExample("Power Tools/Creating Generics/Exercise 2/src/Task.kt", creatingGenericsExercise2.TaskKt::main);
    }

    @Test
    public void testTask275() {
        testExample("Power Tools/Creating Generics/Exercise 3/src/Task.kt", creatingGenericsExercise3.TaskKt::main);
    }

    @Test
    public void testTask276() {
        testExample("Power Tools/Operator Overloading/Exercise 1/src/Task.kt", operatorOverloadingExercise1.TaskKt::main);
    }

    @Test
    public void testTask277() {
        testExample("Power Tools/Operator Overloading/Exercise 2/src/Task.kt", operatorOverloadingExercise2.TaskKt::main);
    }

    @Test
    public void testTask278() {
        testExample("Power Tools/Operator Overloading/Exercise 3/src/Task.kt", operatorOverloadingExercise3.TaskKt::main);
    }

    @Test
    public void testTask279() {
        testExample("Power Tools/Using Operators/Exercise 1/src/Task.kt", usingOperatorsExercise1.TaskKt::main);
    }

    @Test
    public void testTask280() {
        testExample("Power Tools/Using Operators/Exercise 2/src/Task.kt", usingOperatorsExercise2.TaskKt::main);
    }

    @Test
    public void testTask281() {
        testExample("Power Tools/Using Operators/Exercise 3/src/Task.kt", usingOperatorsExercise3.TaskKt::main);
    }

    @Test
    public void testTask282() {
        testExample("Power Tools/Property Delegation/Exercise 1/src/Task.kt", propertyDelegationExercise1.TaskKt::main);
    }

    @Test
    public void testTask283() {
        testExample("Power Tools/Property Delegation/Exercise 2/src/Task.kt", propertyDelegationExercise2.TaskKt::main);
    }

    @Test
    public void testTask284() {
        testExample("Power Tools/Property Delegation/Exercise 3/src/Task.kt", propertyDelegationExercise3.TaskKt::main);
    }

    @Test
    public void testTask285() {
        testExample("Power Tools/Property Delegation Tools/Exercise 1/src/Task.kt", propertyDelegationToolsExercise1.TaskKt::main);
    }

    @Test
    public void testTask286() {
        testExample("Power Tools/Property Delegation Tools/Exercise 2/src/Task.kt", propertyDelegationToolsExercise2.TaskKt::main);
    }

    @Test
    public void testTask287() {
        testExample("Power Tools/Property Delegation Tools/Exercise 3/src/Task.kt", propertyDelegationToolsExercise3.TaskKt::main);
    }

    @Test
    public void testTask288() {
        testExample("Power Tools/Property Delegation Tools/Exercise 4/src/Task.kt", propertyDelegationToolsExercise4.TaskKt::main);
    }

    @Test
    public void testTask289() {
        testExample("Power Tools/Lazy Initialization/Exercise 1/src/Task.kt", lazyInitializationExercise1.TaskKt::main);
    }

    @Test
    public void testTask290() {
        testExample("Power Tools/Lazy Initialization/Exercise 2/src/Task.kt", lazyInitializationExercise2.TaskKt::main);
    }

    @Test
    public void testTask291() {
        testExample("Power Tools/Lazy Initialization/Exercise 3/src/Task.kt", lazyInitializationExercise3.TaskKt::main);
    }

    @Test
    public void testTask292() {
        testExample("Power Tools/Late Initialization/Exercise 1/src/Task.kt", lateInitializationExercise1.TaskKt::main);
    }

    @Test
    public void testTask293() {
        testExample("Power Tools/Late Initialization/Exercise 2/src/Task.kt", lateInitializationExercise2.TaskKt::main);
    }
}