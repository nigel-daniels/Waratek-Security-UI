/**
 * 
 */
package com.waratek.rules.util;

import com.waratek.rules.ClassLink;
import com.waratek.rules.Comment;
import com.waratek.rules.Database;
import com.waratek.rules.File;
import com.waratek.rules.Native;
import com.waratek.rules.Network;
import com.waratek.rules.ReflectClass;
import com.waratek.rules.ReflectConstructor;
import com.waratek.rules.ReflectField;
import com.waratek.rules.ReflectMethod;
import com.waratek.rules.ReflectPackage;
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
				result.append("VERSION 1.0");
				ver = VERSION_1;
				break;
				}
			default:
				{
				result.append("VERSION 1.0");
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
		result.append(object.getNetworkParameter().name() + ":");
		// Set the host and port
		result.append(object.getHost() + ":");
		result.append(object.getPort() + ":");
		result.append(tailRuleLine((Rule) object));
		return result.toString();
		}


	public String caseReflectPackage(ReflectPackage object)
		{
		StringBuffer result = new StringBuffer("reflect:class:");
		// Add the package name ensuring it ends in .* or is *
		String packageName = object.getPackageName();
		if (packageName.endsWith("*"))
			{
			result.append(packageName + ":");
			}
		else
			{
			if (packageName.endsWith("."))
				{
				result.append(packageName + "*:");
				}
			else
				{
				result.append(packageName + ".*:");
				}
			}
		result.append(tailRuleLine((Rule) object));
		return result.toString();
		}


	public String caseReflectClass(ReflectClass object)
		{
		StringBuffer result = new StringBuffer("reflect:class:");
		result.append(object.getPackageName() + ".");
		result.append(object.getClassName() + ":");
		result.append(tailRuleLine((Rule) object));
		return result.toString();
		}


	public String caseReflectConstructor(ReflectConstructor object)
		{
		StringBuffer result = new StringBuffer("reflect:class:");
		result.append(object.getPackageName() + ".");
		result.append(object.getClassName() + ":constructor:");
		result.append(object.getConstructorSignature() + ":");
		result.append(tailRuleLine((Rule) object));
		return result.toString();
		}


	public String caseReflectMethod(ReflectMethod object)
		{
		StringBuffer result = new StringBuffer("reflect:class:");
		result.append(object.getPackageName() + ".");
		result.append(object.getClassName() + ":method:");
		result.append(object.getMethodSignature() + ":");
		result.append(tailRuleLine((Rule) object));
		return result.toString();
		}


	public String caseReflectField(ReflectField object)
		{
		StringBuffer result = new StringBuffer("reflect:class:");
		result.append(object.getPackageName() + ".");
		result.append(object.getClassName() + ":field:");
		result.append(object.getFieldName() + ":");
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
		result.append(object.getDescriptorName() + ":");
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
		result.append(tailRuleLine((Rule) object));
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
