package com.mzc.util;

import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

import java.util.Collections;
import java.util.Set;

/**
 * @author mazhicheng
 * @date 2020/5/31 - 14:34
 */
public class MarkdownUtils {

    /**
     * makedown格式转换为html格式
     * @param marldown
     * @return
     */
    public static String markdownToHtml(String marldown){
        Parser parser = Parser.builder().build();
        Node document = parser.parse(marldown);
        HtmlRenderer renderer = HtmlRenderer.builder().build();
        return renderer.render(document);
    }

//    public static String makedownToHtmlExtensions(String makedown){
//        //H标题生成id
//        Set<Exception> headomgAncborExtensions = Collections.singleton(HeadingA.create());
//    }
}
