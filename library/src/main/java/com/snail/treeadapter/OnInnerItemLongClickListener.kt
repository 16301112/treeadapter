package com.snail.treeadapter

import android.view.View
import android.widget.AdapterView

/**
 * 时间: 2017/12/5 11:15
 * 作者: 曾繁盛
 * 邮箱: 43068145@qq.com
 * 功能:
 */

interface OnInnerItemLongClickListener<T : Node<T>> {
    fun onLongClick(node: T, parent: AdapterView<*>, view: View, position: Int)
}
