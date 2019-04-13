package com.rotabuilder.dom.domain.employee;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QSkill extends com.rotabuilder.dom.domain.solver.QAbstractPersistable
{
    public static final QSkill jdoCandidate = candidate("this");

    public static QSkill candidate(String name)
    {
        return new QSkill(null, name, 5);
    }

    public static QSkill candidate()
    {
        return jdoCandidate;
    }

    public static QSkill parameter(String name)
    {
        return new QSkill(Skill.class, name, ExpressionType.PARAMETER);
    }

    public static QSkill variable(String name)
    {
        return new QSkill(Skill.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression code;

    public QSkill(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.code = new StringExpressionImpl(this, "code");
    }

    public QSkill(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.code = new StringExpressionImpl(this, "code");
    }
}
