package com.rotabuilder.dom.domain.contract;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QContractLine extends com.rotabuilder.dom.domain.solver.QAbstractPersistable
{
    public static final QContractLine jdoCandidate = candidate("this");

    public static QContractLine candidate(String name)
    {
        return new QContractLine(null, name, 5);
    }

    public static QContractLine candidate()
    {
        return jdoCandidate;
    }

    public static QContractLine parameter(String name)
    {
        return new QContractLine(ContractLine.class, name, ExpressionType.PARAMETER);
    }

    public static QContractLine variable(String name)
    {
        return new QContractLine(ContractLine.class, name, ExpressionType.VARIABLE);
    }

    public final com.rotabuilder.dom.domain.contract.QContract contract;
    public final ObjectExpression<com.rotabuilder.dom.domain.contract.ContractLineType> contractLineType;
    public final ObjectExpression<com.rotabuilder.dom.domain.contract.ContractRepository> contractRepository;

    public QContractLine(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        if (depth > 0)
        {
            this.contract = new com.rotabuilder.dom.domain.contract.QContract(this, "contract", depth-1);
        }
        else
        {
            this.contract = null;
        }
        this.contractLineType = new ObjectExpressionImpl<com.rotabuilder.dom.domain.contract.ContractLineType>(this, "contractLineType");
        this.contractRepository = new ObjectExpressionImpl<com.rotabuilder.dom.domain.contract.ContractRepository>(this, "contractRepository");
    }

    public QContractLine(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.contract = new com.rotabuilder.dom.domain.contract.QContract(this, "contract", 5);
        this.contractLineType = new ObjectExpressionImpl<com.rotabuilder.dom.domain.contract.ContractLineType>(this, "contractLineType");
        this.contractRepository = new ObjectExpressionImpl<com.rotabuilder.dom.domain.contract.ContractRepository>(this, "contractRepository");
    }
}
