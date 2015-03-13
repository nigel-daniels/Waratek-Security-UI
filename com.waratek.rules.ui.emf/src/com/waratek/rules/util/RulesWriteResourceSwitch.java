/**
 * 
 */
package com.waratek.rules.util;

import com.waratek.rules.ClassLink;
import com.waratek.rules.ClassLinkParameter;
import com.waratek.rules.Comment;
import com.waratek.rules.Database;
import com.waratek.rules.File;
import com.waratek.rules.Native;
import com.waratek.rules.Network;
import com.waratek.rules.Reflection;
import com.waratek.rules.ReflectionParameter;
import com.waratek.rules.Rule;
import com.waratek.rules.RuleDocument;
import com.waratek.rules.SQLInjection;
import com.waratek.rules.ThrowableClass;
import com.waratek.rules.Version;

/**
 * @author Nigel
 * @generated NOT
 * 
 *            Used to generate entire lines of the rules file, if an abstract is
 *            submitted then a null is returned.
 */
public class RulesWriteResourceSwitch extends RulesSwitch<String>
	{
	private static final int	VERSION_1	= 1;
	private int					ver			= VERSION_1;


	public String caseRuleDocument(RuleDocument object)
		{
		StringBuffer result = new StringBuffer("");
		// Set the Version
		switch (object.getVersion().getValue())
			{
			case Version.ONE_VALUE:
				{
				result.append(RulesResourceImpl.VERSION_1);
				ver = VERSION_1;
				break;
				}
			default:
				{
				result.append(RulesResourceImpl.VERSION_1);
				ver = VERSION_1;
				break;
				}
			}
		result.append(String.format("%n", (Object) null));
		return result.toString();
		}


	public String caseFile(File object)
		{
		StringBuffer result = new StringBuffer("file:");
		// Set the basic file parameter
		result.append(object.getFileParameter().getName() + ":");
		// Set the path
		result.append(object.getPath() + ":");
		result.append(tailRuleLine((Rule) object));
		return result.toString();
		}


	public String caseNetwork(Network object)
		{
		StringBuffer result = new StringBuffer("network:");
		// Set the basic netoerk parameter
		result.append(object.getNetworkParameter().getName() + ":");
		// Set the host and port
		result.append(object.getHost() + ":");
		result.append(object.getPort() + ":");
		result.append(tailRuleLine((Rule) object));
		return result.toString();
		}


	public String caseReflection(Reflection object)
		{
		StringBuffer result = new StringBuffer("reflect:");
		
		switch (object.getReflectionParameter().getValue())
			{
			case ReflectionParameter.CONSTRUCTOR_VALUE:
				{
				result.append("constructor:");
				break;
				}
			case ReflectionParameter.METHOD_VALUE:
				{
				result.append("method:");
				break;
				}
			case ReflectionParameter.FIELD_VALUE:
				{
				result.append("field:");
				break;
				}
			default:
				{
				result.append("method:");
				break;
				}
			}
		
		result.append(object.getQualifiedName() + ":");
		
		if (!object.getSignature().equals("")) {result.append(object.getSignature() + ":");}
		
		result.append(tailRuleLine((Rule) object));
		return result.toString();
		}

	public String caseThrowableClass(ThrowableClass object)
		{
		StringBuffer result = new StringBuffer("throwable:throw:");
		result.append(object.getClassName() + ":");
		result.append(tailRuleLine((Rule) object));
		return result.toString();
		}


	public String caseClassLink(ClassLink object)
		{
		StringBuffer result = new StringBuffer("classlink:class:");
		
		switch (object.getClassLinkParameter().getValue())
			{
			case ClassLinkParameter.CLASS_VALUE:
				{
				result.append("class:");
				break;
				}
			case ClassLinkParameter.CONSTRUCTOR_VALUE:
				{
				result.append("constructor:");
				break;
				}
			case ClassLinkParameter.METHOD_VALUE:
				{
				result.append("method:");
				break;
				}
			case ClassLinkParameter.FIELD_VALUE:
				{
				result.append("field:");
				break;
				}
			default:
				{
				result.append("class:");
				break;
				}
			}
	
	result.append(object.getQualifiedName() + ":");
	
	if (!object.getSignature().equals("")) {result.append(object.getSignature() + ":");}
	
		result.append(tailRuleLine((Rule) object));
		return result.toString();
		}


	public String caseNative(Native object)
		{
		StringBuffer result = new StringBuffer("native:library:");
		result.append(object.getPath());
		String checksum = object.getChecksum();
		if (checksum.isEmpty())
			{
			result.append(":");
			}
		else
			{
			result.append(";" + checksum + ":");
			}
		
		result = new StringBuffer(object.getNativeAction().getName() + ":");
		result.append(object.getLog().getName());
		result.append(String.format("%n", (Object) null));
		
		return result.toString();
		}


	public String caseSQLInjection(SQLInjection object)
		{
		StringBuffer result = new StringBuffer("sql:database:");
		result.append(object.getDatabase().getName());
		switch (object.getDatabase().getValue())
			{
			case Database.ORACLE_VALUE:
				{
				result.append(":");
				break;
				}
			case Database.MYSQL_VALUE:
				{
				result.append(object.isAnsiQuotes() ? ";ansiquotes=on" : ";ansiquotes=off");
				result.append(object.isNoBackSlashEscapes() ? ",nobackslashescapes=on:" : ",nobackslashescapes=off:");
				break;
				}
			default:
				{
				result.append(":");
				break;
				}
			}
		result.append(tailRuleLine((Rule) object));
		return result.toString();
		}


	public String caseComment(Comment object)
		{
		StringBuffer result = new StringBuffer("# ");
		result.append(object.getComment());
		result.append(String.format("%n", (Object) null));
		return result.toString();
		}


	private String tailRuleLine(Rule object)
		{
		StringBuffer result = new StringBuffer(object.getAction().getName() + ":");
		result.append(object.getLog().getName());
		result.append(String.format("%n", (Object) null));
		return result.toString();
		}
	}
