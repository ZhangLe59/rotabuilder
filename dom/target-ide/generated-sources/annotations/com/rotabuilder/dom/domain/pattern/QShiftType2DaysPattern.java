package com.rotabuilder.dom.domain.pattern;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QShiftType2DaysPattern extends com.rotabuilder.dom.domain.pattern.QPattern
{
    public static final QShiftType2DaysPattern jdoCandidate = candidate("this");

    public static QShiftType2DaysPattern candidate(String name)
    {
        return new QShiftType2DaysPattern(null, name, 5);
    }

    public static QShiftType2DaysPattern candidate()
    {
        return jdoCandidate;
    }

    public static QShiftType2DaysPattern parameter(String name)
    {
        return new QShiftType2DaysPattern(ShiftType2DaysPattern.class, name, ExpressionType.PARAMETER);
    }

    public static QShiftType2DaysPattern variable(String name)
    {
        return new QShiftType2DaysPattern(ShiftType2DaysPattern.class, name, ExpressionType.VARIABLE);
    }

    public final com.rotabuilder.dom.domain.shift.QShiftType dayIndex0ShiftType;
    public final com.rotabuilder.dom.domain.shift.QShiftType dayIndex1ShiftType;

    public QShiftType2DaysPattern(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        if (depth > 0)
        {
            this.dayIndex0ShiftType = new com.rotabuilder.dom.domain.shift.QShiftType(this, "dayIndex0ShiftType", depth-1);
        }
        else
        {
            this.dayIndex0ShiftType = null;
        }
        if (depth > 0)
        {
            this.dayIndex1ShiftType = new com.rotabuilder.dom.domain.shift.QShiftType(this, "dayIndex1ShiftType", depth-1);
        }
        else
        {
            this.dayIndex1ShiftType = null;
        }
    }

    public QShiftType2DaysPattern(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.dayIndex0ShiftType = new com.rotabuilder.dom.domain.shift.QShiftType(this, "dayIndex0ShiftType", 5);
        this.dayIndex1ShiftType = new com.rotabuilder.dom.domain.shift.QShiftType(this, "dayIndex1ShiftType", 5);
    }
}
