package org.openrndr

import org.openrndr.events.Event

enum class KeyboardModifier(val mask: Int) {
    SHIFT(1),
    CTRL(2),
    ALT(4),
    SUPER(8)
}

enum class MouseButton {
    LEFT,
    RIGHT,
    CENTER,
    NONE
}

enum class MouseEventType {
    MOVED,
    DRAGGED,
    CLICKED,
    BUTTON_UP,
    BUTTON_DOWN,
    SCROLLED,
}

enum class KeyEventType {
    KEY_DOWN,
    KEY_UP,
    KEY_REPEAT,
}

class KeyEvent(val type: KeyEventType, val key: Int, val scanCode: Int, val name: String, val modifiers: Set<KeyboardModifier>, var propagationCancelled: Boolean = false) {
    fun cancelPropagation() {
        propagationCancelled = true
    }
}

const val KEY_SPACEBAR = 32

const val KEY_ESCAPE = 256
const val KEY_ENTER = 257

const val KEY_TAB = 258
const val KEY_BACKSPACE = 259
const val KEY_INSERT = 260
const val KEY_DELETE = 261
const val KEY_ARROW_RIGHT = 262
const val KEY_ARROW_LEFT = 263
const val KEY_ARROW_DOWN = 264
const val KEY_ARROW_UP = 265
const val KEY_PAGE_UP = 266
const val KEY_PAGE_DOWN = 267
const val KEY_HOME = 268
const val KEY_END = 269

const val KEY_CAPSLOCK = 280
const val KEY_PRINT_SCREEN = 283


const val KEY_F1 = 290
const val KEY_F2 = 291
const val KEY_F3 = 292
const val KEY_F4 = 293
const val KEY_F5 = 294
const val KEY_F6 = 295
const val KEY_F7 = 296
const val KEY_F8 = 297
const val KEY_F9 = 298
const val KEY_F10 = 299
const val KEY_F11 = 300
const val KEY_F12 = 301

const val KEY_LEFT_SHIFT = 340
const val KEY_RIGHT_SHIFT = 344

class Keyboard {
    val keyDown = Event<KeyEvent>().postpone(true)
    val keyUp = Event<KeyEvent>().postpone(true)
    val keyRepeat = Event<KeyEvent>().postpone(true)
    val character = Event<Program.CharacterEvent>().postpone(true)
}