package com.rotabuilder.dom.domain.pattern;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QFreeBefore2DaysWithAWorkDayPattern extends com.rotabuilder.dom.domain.pattern.QPattern
{
    public static final QFreeBefore2DaysWithAWorkDayPattern jdoCandidate = candidate("this");

    public static QFreeBefore2DaysWithAWorkDayPattern candidate(String name)
    {
        return new QFreeBefore2DaysWithAWorkDayPattern(null, name, 5);
    }

    public static QFreeBefore2DaysWithAWorkDayPattern candidate()
    {
        return jdoCandidate;
    }

    public static QFreeBefore2DaysWithAWorkDayPattern parameter(String name)
    {
        return new QFreeBefore2DaysWithAWorkDayPattern(FreeBefore2DaysWithAWorkDayPattern.class, name, ExpressionType.PARAMETER);
    }

    public static QFreeBefore2DaysWithAWorkDayPattern variable(String name)
    {
        return new QFreeBefore2DaysWithAWorkDayPattern(FreeBefore2DaysWithAWorkDayPattern.class, name, ExpressionType.VARIABLE);
    }

    public final ObjectExpression<com.rotabuilder.dom.domain.pattern.DayOfWeek> freeDayOfWeek;

    public QFreeBefore2DaysWithAWorkDayPattern(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.freeDayOfWeek = new ObjectExpressionImpl<com.rotabuilder.dom.domain.pattern.DayOfWeek>(this, "freeDayOfWeek");
    }

    public QFreeBefore2DaysWithAWorkDayPattern(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.freeDayOfWeek = new ObjectExpressionImpl<com.rotabuilder.dom.domain.pattern.DayOfWeek>(this, "freeDayOfWeek");
    }
}
