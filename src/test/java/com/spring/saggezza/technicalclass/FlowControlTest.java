package com.spring.saggezza.technicalclass;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class FlowControlTest {

    @Test
    public void givenOneCallIsIntegerOnce() {

        //    Given: I am a user
            IIntTester intTester = mock(IntTester.class);
            IBoundaryChecker boundaryChecker = mock(BoundaryChecker.class);

            IFlowController flowController = new FlowController(intTester, boundaryChecker);

        //    When: I enter the string “1”
            when(intTester.isInteger("1")).thenReturn(true);

        //    Then: call isInteger() once
            flowController.run("1");
            verify(intTester, times(1)).isInteger("1");


    }

    @Test
    public void givenZeroCallIsIntegerOnce() {

        //    Given: I am a user
        IIntTester intTester = mock(IntTester.class);
        IBoundaryChecker boundaryChecker = mock(BoundaryChecker.class);

        IFlowController flowController = new FlowController(intTester, boundaryChecker);

        //    When: I enter the string “0”
        when(intTester.isInteger("0")).thenReturn(true);

        //    Then: call isInteger() once
        flowController.run("0");
        verify(intTester, times(1)).isInteger("0");

    }

    @Test
    public void givenBobCallIsIntegerOnce() {

        //    Given: I am a user
        IIntTester intTester = mock(IntTester.class);
        IBoundaryChecker boundaryChecker = mock(BoundaryChecker.class);

        IFlowController flowController = new FlowController(intTester, boundaryChecker);

        //    When: I enter the string “Bob”
        when(intTester.isInteger("Bob")).thenReturn(false);

        //    Then: call isInteger() once
        flowController.run("Bob");
        verify(intTester, times(1)).isInteger("Bob");

    }

    @Test
    public void givenOneCallIsInsideBoundaryOnce() {

        //    Given: I am a user
        IIntTester intTester = mock(IntTester.class);
        IBoundaryChecker boundaryChecker = mock(BoundaryChecker.class);

        IFlowController flowController = new FlowController(intTester, boundaryChecker);

        //    When: I enter the string “0”
        when(intTester.isInteger("0")).thenReturn(true);

        //    Then: call isInteger() once
        flowController.run("0");
        verify(intTester, times(1)).isInteger("0");

    }

}
