// Generated from /Users/kjones/Projects/Tooling/pkgforce/jvm/src/main/antlr/com/nawforce/parsers/ApexParser.g4 by ANTLR 4.8
package com.nawforce.runtime.parsers;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ApexParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ApexParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ApexParser#triggerUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerUnit(ApexParser.TriggerUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#triggerCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerCase(ApexParser.TriggerCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(ApexParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(ApexParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(ApexParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(ApexParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(ApexParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(ApexParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(ApexParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(ApexParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(ApexParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(ApexParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(ApexParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(ApexParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(ApexParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(ApexParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(ApexParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(ApexParser.PropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(ApexParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(ApexParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(ApexParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(ApexParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#typeRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeRef(ApexParser.TypeRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#arraySubscripts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraySubscripts(ApexParser.ArraySubscriptsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(ApexParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(ApexParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(ApexParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(ApexParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(ApexParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(ApexParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ApexParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(ApexParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(ApexParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(ApexParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(ApexParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(ApexParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ApexParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(ApexParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(ApexParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ApexParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ApexParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(ApexParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#whenControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenControl(ApexParser.WhenControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#whenValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenValue(ApexParser.WhenValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#whenLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenLiteral(ApexParser.WhenLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(ApexParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ApexParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(ApexParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(ApexParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(ApexParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(ApexParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(ApexParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(ApexParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#insertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStatement(ApexParser.InsertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#updateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStatement(ApexParser.UpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#deleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(ApexParser.DeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#undeleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndeleteStatement(ApexParser.UndeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#upsertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpsertStatement(ApexParser.UpsertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#mergeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeStatement(ApexParser.MergeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#runAsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRunAsStatement(ApexParser.RunAsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(ApexParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#propertyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyBlock(ApexParser.PropertyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#getter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter(ApexParser.GetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter(ApexParser.SetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(ApexParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(ApexParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(ApexParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(ApexParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(ApexParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(ApexParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(ApexParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(ApexParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryExpression}
	 * labeled alternative in {@link ApexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(ApexParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arth1Expression}
	 * labeled alternative in {@link ApexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArth1Expression(ApexParser.Arth1ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dotExpression}
	 * labeled alternative in {@link ApexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotExpression(ApexParser.DotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitOrExpression}
	 * labeled alternative in {@link ApexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOrExpression(ApexParser.BitOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayExpression}
	 * labeled alternative in {@link ApexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpression(ApexParser.ArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newExpression}
	 * labeled alternative in {@link ApexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(ApexParser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpression}
	 * labeled alternative in {@link ApexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpression(ApexParser.AssignExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link ApexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallExpression(ApexParser.MethodCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitNotExpression}
	 * labeled alternative in {@link ApexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitNotExpression(ApexParser.BitNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arth2Expression}
	 * labeled alternative in {@link ApexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArth2Expression(ApexParser.Arth2ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logAndExpression}
	 * labeled alternative in {@link ApexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogAndExpression(ApexParser.LogAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code castExpression}
	 * labeled alternative in {@link ApexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(ApexParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitAndExpression}
	 * labeled alternative in {@link ApexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitAndExpression(ApexParser.BitAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmpExpression}
	 * labeled alternative in {@link ApexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpExpression(ApexParser.CmpExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitExpression}
	 * labeled alternative in {@link ApexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitExpression(ApexParser.BitExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logOrExpression}
	 * labeled alternative in {@link ApexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogOrExpression(ApexParser.LogOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condExpression}
	 * labeled alternative in {@link ApexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExpression(ApexParser.CondExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link ApexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(ApexParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postOpExpression}
	 * labeled alternative in {@link ApexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostOpExpression(ApexParser.PostOpExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negExpression}
	 * labeled alternative in {@link ApexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegExpression(ApexParser.NegExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preOpExpression}
	 * labeled alternative in {@link ApexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreOpExpression(ApexParser.PreOpExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instanceOfExpression}
	 * labeled alternative in {@link ApexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceOfExpression(ApexParser.InstanceOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subPrimary}
	 * labeled alternative in {@link ApexParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubPrimary(ApexParser.SubPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisPrimary}
	 * labeled alternative in {@link ApexParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisPrimary(ApexParser.ThisPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code superPrimary}
	 * labeled alternative in {@link ApexParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperPrimary(ApexParser.SuperPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalPrimary}
	 * labeled alternative in {@link ApexParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralPrimary(ApexParser.LiteralPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeRefPrimary}
	 * labeled alternative in {@link ApexParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeRefPrimary(ApexParser.TypeRefPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idPrimary}
	 * labeled alternative in {@link ApexParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdPrimary(ApexParser.IdPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code soqlPrimary}
	 * labeled alternative in {@link ApexParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoqlPrimary(ApexParser.SoqlPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(ApexParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#dotMethodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotMethodCall(ApexParser.DotMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(ApexParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(ApexParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#idCreatedNamePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdCreatedNamePair(ApexParser.IdCreatedNamePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#noRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoRest(ApexParser.NoRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(ApexParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(ApexParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#mapCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapCreatorRest(ApexParser.MapCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#mapCreatorRestPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapCreatorRestPair(ApexParser.MapCreatorRestPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#setCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetCreatorRest(ApexParser.SetCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(ApexParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#soqlLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoqlLiteral(ApexParser.SoqlLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ApexParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#anyId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyId(ApexParser.AnyIdContext ctx);
}