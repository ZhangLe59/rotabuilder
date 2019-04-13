package com.rotabuilder.dom.domain.pattern;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QWorkBeforeFreeSequencePattern extends com.rotabuilder.dom.domain.pattern.QPattern
{
    public static final QWorkBeforeFreeSequencePattern jdoCandidate = candidate("this");

    public static QWorkBeforeFreeSequencePattern candidate(String name)
    {
        return new QWorkBeforeFreeSequencePattern(null, name, 5);
    }

    public static QWorkBeforeFreeSequencePattern candidate()
    {
        return jdoCandidate;
    }

    public static QWorkBeforeFreeSequencePattern parameter(String name)
    {
        return new QWorkBeforeFreeSequencePattern(WorkBeforeFreeSequencePattern.class, name, ExpressionType.PARAMETER);
    }

    public static QWorkBeforeFreeSequencePattern variable(String name)
    {
        return new QWorkBeforeFreeSequencePattern(WorkBeforeFreeSequencePattern.class, name, ExpressionType.VARIABLE);
    }

    public final ObjectExpression<com.rotabuilder.dom.domain.pattern.DayOfWeek> workDayOfWeek;
    public final com.rotabuilder.dom.domain.shift.QShiftType workShiftType;
    public final NumericExpression<Integer> freeDayLength;

    public QWorkBeforeFreeSequencePattern(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.workDayOfWeek = new ObjectExpressionImpl<com.rotabuilder.dom.domain.pattern.DayOfWeek>(this, "workDayOfWeek");
        if (depth > 0)
        {
            this.workShiftType = new com.rotabuilder.dom.domain.shift.QShiftType(this, "workShiftType", depth-1);
        }
        else
        {
            this.workShiftType = null;
        }
        this.freeDayLength = new NumericExpressionImpl<Integer>(this, "freeDayLength");
    }

    public QWorkBeforeFreeSequencePattern(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.workDayOfWeek = new ObjectExpressionImpl<com.rotabuilder.dom.domain.pattern.DayOfWeek>(this, "workDayOfWeek");
        this.workShiftType = new com.rotabuilder.dom.domain.shift.QShiftType(this, "workShiftType", 5);
        this.freeDayLength = new NumericExpressionImpl<Integer>(this, "freeDayLength");
    }
}
