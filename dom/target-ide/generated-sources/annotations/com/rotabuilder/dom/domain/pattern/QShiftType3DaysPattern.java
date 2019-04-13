package com.rotabuilder.dom.domain.pattern;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QShiftType3DaysPattern extends com.rotabuilder.dom.domain.pattern.QPattern
{
    public static final QShiftType3DaysPattern jdoCandidate = candidate("this");

    public static QShiftType3DaysPattern candidate(String name)
    {
        return new QShiftType3DaysPattern(null, name, 5);
    }

    public static QShiftType3DaysPattern candidate()
    {
        return jdoCandidate;
    }

    public static QShiftType3DaysPattern parameter(String name)
    {
        return new QShiftType3DaysPattern(ShiftType3DaysPattern.class, name, ExpressionType.PARAMETER);
    }

    public static QShiftType3DaysPattern variable(String name)
    {
        return new QShiftType3DaysPattern(ShiftType3DaysPattern.class, name, ExpressionType.VARIABLE);
    }

    public final com.rotabuilder.dom.domain.shift.QShiftType dayIndex0ShiftType;
    public final com.rotabuilder.dom.domain.shift.QShiftType dayIndex1ShiftType;
    public final com.rotabuilder.dom.domain.shift.QShiftType dayIndex2ShiftType;

    public QShiftType3DaysPattern(PersistableExpression parent, String name, int depth)
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
        if (depth > 0)
        {
            this.dayIndex2ShiftType = new com.rotabuilder.dom.domain.shift.QShiftType(this, "dayIndex2ShiftType", depth-1);
        }
        else
        {
            this.dayIndex2ShiftType = null;
        }
    }

    public QShiftType3DaysPattern(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.dayIndex0ShiftType = new com.rotabuilder.dom.domain.shift.QShiftType(this, "dayIndex0ShiftType", 5);
        this.dayIndex1ShiftType = new com.rotabuilder.dom.domain.shift.QShiftType(this, "dayIndex1ShiftType", 5);
        this.dayIndex2ShiftType = new com.rotabuilder.dom.domain.shift.QShiftType(this, "dayIndex2ShiftType", 5);
    }
}
