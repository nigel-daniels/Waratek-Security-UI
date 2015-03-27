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
	private static final int	V_1	= 1;
	private int					ver			= V_1;


	public String caseRuleDocument(RuleDocument object)
		{
		StringBuffer result = new StringBuffer("");
		// Set the Version
		switch (object.getVersion().getValue())
			{
			case Version.ONE_VALUE:
				{
				result.append(RulesResourceImpl.VERSION_1);
				ver = V_1;
				break;
				}
			default:
				{
				result.append(RulesResourceImpl.VERSION_1);
				ver = V_1;
				break;
				}
			}
		result.append(RulesResourceImpl.RETURN);
		return result.toString();
		}


	public String caseFile(File object)
		{
		StringBuffer result = new StringBuffer("file" + RulesResourceImpl.SEPERATOR_PRIMARY);
		// Set the basic file parameter
		result.append(object.getFileParameter().getName() + RulesResourceImpl.SEPERATOR_PRIMARY);
		// Set the path
		result.append(object.getPath() + RulesResourceImpl.SEPERATOR_PRIMARY);
		result.append(tailRuleLine((Rule) object));
		return result.toString();
		}


	public String caseNetwork(Network object)
		{
		StringBuffer result = new StringBuffer("network" + RulesResourceImpl.SEPERATOR_PRIMARY);
		// Set the basic netoerk parameter
		result.append(object.getNetworkParameter().getName() + RulesResourceImpl.SEPERATOR_PRIMARY);
		// Set the host and port
		result.append(object.getHost() + RulesResourceImpl.SEPERATOR_PRIMARY);
		result.append(object.getPort() + RulesResourceImpl.SEPERATOR_PRIMARY);
		result.append(tailRuleLine((Rule) object));
		return result.toString();
		}


	public String caseReflection(Reflection object)
		{
		StringBuffer result = new StringBuffer("reflect" + RulesResourceImpl.SEPERATOR_PRIMARY);
		
		switch (object.getReflectionParameter().getValue())
			{
			case ReflectionParameter.CONSTRUCTOR_VALUE:
				{
				result.append("constructor" + RulesResourceImpl.SEPERATOR_PRIMARY);
				break;
				}
			case ReflectionParameter.METHOD_VALUE:
				{
				result.append("method" + RulesResourceImpl.SEPERATOR_PRIMARY);
				break;
				}
			case ReflectionParameter.FIELD_VALUE:
				{
				result.append("field" + RulesResourceImpl.SEPERATOR_PRIMARY);
				break;
				}
			default:
				{
				result.append("method" + RulesResourceImpl.SEPERATOR_PRIMARY);
				break;
				}
			}
		
		result.append(object.getQualifiedName() + RulesResourceImpl.SEPERATOR_PRIMARY);
		
		if (!object.getSignature().equals("")) {result.append(object.getSignature() + RulesResourceImpl.SEPERATOR_PRIMARY);}
		
		result.append(tailRuleLine((Rule) object));
		return result.toString();
		}

	public String caseThrowableClass(ThrowableClass object)
		{
		StringBuffer result = new StringBuffer("throwable" + RulesResourceImpl.SEPERATOR_PRIMARY + "throw" + RulesResourceImpl.SEPERATOR_PRIMARY);
		result.append(object.getClassName() + RulesResourceImpl.SEPERATOR_PRIMARY);
		result.append(tailRuleLine((Rule) object));
		return result.toString();
		}


	public String caseClassLink(ClassLink object)
		{
		StringBuffer result = new StringBuffer("classlink" + RulesResourceImpl.SEPERATOR_PRIMARY);
		
		switch (object.getClassLinkParameter().getValue())
			{
			case ClassLinkParameter.CLASS_VALUE:
				{
				result.append("class" + RulesResourceImpl.SEPERATOR_PRIMARY);
				break;
				}
			case ClassLinkParameter.CONSTRUCTOR_VALUE:
				{
				result.append("constructor" + RulesResourceImpl.SEPERATOR_PRIMARY);
				break;
				}
			case ClassLinkParameter.METHOD_VALUE:
				{
				result.append("method" + RulesResourceImpl.SEPERATOR_PRIMARY);
				break;
				}
			case ClassLinkParameter.FIELD_VALUE:
				{
				result.append("field" + RulesResourceImpl.SEPERATOR_PRIMARY);
				break;
				}
			default:
				{
				result.append("class" + RulesResourceImpl.SEPERATOR_PRIMARY);
				break;
				}
			}
	
	result.append(object.getQualifiedName() + RulesResourceImpl.SEPERATOR_PRIMARY);
	
	if (object.getSignature() != null && !object.getSignature().equals("")) {result.append(object.getSignature() + RulesResourceImpl.SEPERATOR_PRIMARY);}
	
		result.append(tailRuleLine((Rule) object));
		return result.toString();
		}


	public String caseNative(Native object)
		{
		StringBuffer result = new StringBuffer("native" + RulesResourceImpl.SEPERATOR_PRIMARY + "library" + RulesResourceImpl.SEPERATOR_PRIMARY);
		result.append(object.getPath());
		String checksum = object.getChecksum();
		if (checksum.isEmpty())
			{result.append(RulesResourceImpl.SEPERATOR_PRIMARY);}
		else
			{result.append(RulesResourceImpl.SEPERATOR_SECONDARY + checksum + RulesResourceImpl.SEPERATOR_PRIMARY);}
		
		result.append(object.getNativeAction().getName() + RulesResourceImpl.SEPERATOR_PRIMARY);
		result.append(object.getLog().getName());
		result.append(RulesResourceImpl.RETURN);
		
		return result.toString();
		}


	public String caseSQLInjection(SQLInjection object)
		{
		StringBuffer result = new StringBuffer("sql" + RulesResourceImpl.SEPERATOR_PRIMARY + "database" + RulesResourceImpl.SEPERATOR_PRIMARY);
		result.append(object.getDatabase().getName());
		switch (object.getDatabase().getValue())
			{
			case Database.ORACLE_VALUE:
				{
				result.append(RulesResourceImpl.SEPERATOR_PRIMARY);
				break;
				}
			case Database.MYSQL_VALUE:
				{
				result.append(object.isAnsiQuotes() ? RulesResourceImpl.SEPERATOR_SECONDARY + "ansiquotes=on" : RulesResourceImpl.SEPERATOR_SECONDARY + "ansiquotes=off");
				result.append(object.isNoBackSlashEscapes() ? RulesResourceImpl.SEPERATOR_TERTIARY + "nobackslashescapes=on" + RulesResourceImpl.SEPERATOR_PRIMARY : RulesResourceImpl.SEPERATOR_TERTIARY + "nobackslashescapes=off" + RulesResourceImpl.SEPERATOR_PRIMARY);
				break;
				}
			default:
				{
				result.append(RulesResourceImpl.SEPERATOR_PRIMARY);
				break;
				}
			}
		result.append(tailRuleLine((Rule) object));
		return result.toString();
		}


	public String caseComment(Comment object)
		{
		StringBuffer result = new StringBuffer(RulesResourceImpl.RETURN);
		result.append(RulesResourceImpl.COMMENT + " ");
		result.append(object.getComment());
		result.append(RulesResourceImpl.RETURN);
		return result.toString();
		}


	private String tailRuleLine(Rule object)
		{
		StringBuffer result = new StringBuffer(object.getAction().getName() + RulesResourceImpl.SEPERATOR_PRIMARY);
		result.append(object.getLog().getName());
		result.append(RulesResourceImpl.RETURN);
		return result.toString();
		}
	}
